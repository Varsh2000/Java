
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMethod {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "system";
	private static final String INSERT_QUERY = "INSERT INTO emp1 VALUES(?,?,?);";
	private static final String SELECT_QUERY = "SELECT * FROM emp1;";
	private static final String UPDATE_QUERY = "UPDATE emp1 SET NAME = 'DEVI' WHERE ID = 2;";
	private static final String DELETE_QUERY = "DELETE FROM emp1 where id = 2;";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			Statement stmt = con.createStatement();
			System.out.println("Choose options as given below: ");
			System.out.println("1.To Insert data");
			System.out.println("2.To Read data");
			System.out.println("3.To Update data");
			System.out.println("4.To Delete data");
			int option = scan.nextInt();
			switch (option) {
			case 1: {

				//To insert data
				createData(con,INSERT_QUERY,scan);
				break;
			}
			case 2:{
				//To Read data
				ResultSet rs = readData(stmt,SELECT_QUERY);
				while(rs.next()) {
					System.out.println("Id = "+rs.getInt(1)+" Name = "+rs.getString(2)+" Salary = "+rs.getInt(3));
				}
				break;
			}
			case 3:{
				//UPDATE DATA
				updateData(stmt,UPDATE_QUERY);
				break;
			}
			case 4 :{
				//delete data
				deleteData(stmt,DELETE_QUERY);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(scan != null) {
				scan.close();
			}
		}

	}

	// Insert
	static void createData(Connection con, String insertQuery, Scanner scan) {
		try {
			System.out.println("Enter value for ID = ");
			int id = scan.nextInt();
			System.out.println("Enter value for Name = ");
			String name = scan.next();
			System.out.println("Enter value for Salary = ");
			double salary = scan.nextDouble();
			PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// Select
	public static ResultSet readData(Statement stmt, String insertQuery) {

		try {
			return stmt.executeQuery(SELECT_QUERY);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//Update
	public static void updateData(Statement stmt, String UPDATE_QUERY) {
		try {
			int rows_Affected = stmt.executeUpdate(UPDATE_QUERY);
			System.out.println(rows_Affected+" rows Affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Delete
	public static void deleteData(Statement stmt, String deleteQuery) {
		try {
			int rows_Affected = stmt.executeUpdate(deleteQuery);
			System.out.println(rows_Affected+" rows Affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
