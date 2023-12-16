package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMethod {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "system";
	private static final String INSERT_QUERY="INSERT INTO EMP1 VALUES(?,?,?);";
	private static final String SELECT_QUERY = "SELECT * FROM EMP1;";
	private static final String UPDATE_QUERY = "UPDATE EMP1 SET Salary=(Salary+10000) WHERE ID=?;";
	private static final String DELETE_QUERY = "DELETE FROM EMP1 WHERE ID=?;";


	public static void main(String[] args) {
		Connection con =null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded and Registered Successfully! ");
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully! "+con);
			
			boolean exit = false;
            while (!exit) {
			System.out.println("Choose appropriate Option");
			System.out.println("1. TO INSERT DATA");
			System.out.println("2. TO SELECT DATA");
			System.out.println("3. TO UPDATE DATA");
			System.out.println("4. TO DELETE DATA");
			System.out.println("5. QUIT");
			int option=sc.nextInt();
			switch(option) {
			case 1:{
				System.out.println("Emp1 Table");
				selectEmpData(con,sc);
				insertEmpData(con,sc);
				System.out.println("Emp1 Table After Insertion");
				selectEmpData(con,sc);
				break;
			}
			case 2:{
				selectEmpData(con,sc);
				break;
			}
			case 3:{
				System.out.println("Emp1 Table");
				selectEmpData(con,sc);
				updateEmpData(con,sc);
				System.out.println("Emp1 Table After Updation");
				selectEmpData(con,sc);
				break;
			}
			case 4:{
				System.out.println("Emp1 Table");
				selectEmpData(con,sc);
				deleteEmpData(con,sc);
				System.out.println("Emp1 Table After Deletion");
				selectEmpData(con,sc);
				break;
			}
			case 5:{
				return;
			}
			default:{
				System.out.println("Invalid Option");
			}
			}
			
			if (option == 5) {
                exit = true;
            }
        }

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!= null) {
				sc.close();
			}
		}

	}
	private static void insertEmpData(Connection con,Scanner sc) {
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Salary");
		int salary=sc.nextInt();
		try {
			PreparedStatement psmt= con.prepareStatement(INSERT_QUERY);
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, salary);
			psmt.execute();

			System.out.println();
			System.out.println("Data Inserted Successfully!");
			System.out.println();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	private static void selectEmpData(Connection con, Scanner sc) {
		try {
			PreparedStatement psmt=con.prepareStatement(SELECT_QUERY);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				System.out.println("ID= "+rs.getInt(1)
				+", Name= "+rs.getString(2)
				+", Salary= "+rs.getInt(3));
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	private static void updateEmpData(Connection con, Scanner sc) {
		try {
			PreparedStatement psmt=con.prepareStatement(UPDATE_QUERY);
			System.out.println("Enter ID whose salary need to be updated");
			int id=sc.nextInt();
			psmt.setInt(1, id);
			psmt.execute();
			System.out.println();
			System.out.println("Salary for Employee with ID "+id+" got updated");
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	private static void deleteEmpData(Connection con, Scanner sc) {
		try {
			PreparedStatement psmt = con.prepareStatement(DELETE_QUERY);
			System.out.println("Enter ID whose salary need to be updated");
			int id=sc.nextInt();
			psmt.setInt(1, id);
			psmt.execute();
			System.out.println();
			System.out.println("Salary for Employee with ID "+id+" got deleted");
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
