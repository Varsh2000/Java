package com.jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentJDBCDemo {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "system";
	
	
	public static void main(String[] args) {
		Connection con =null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded and Registered Successfully! ");
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully! "+con);
		
			Statement stmt= con.createStatement();

		Student s1= new Student(4,"Amit",35);
		Student s2= new Student(5,"Ajay",87);
		DBHandler.insertData(con, s1);
		DBHandler.insertData(con, s2);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!= null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
