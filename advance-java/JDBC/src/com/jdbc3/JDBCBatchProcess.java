package com.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBatchProcess {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "system";
	private static final String QUERY1="UPDATE TRAINER SET GENDER='Male' WHERE ID!=4;";
	private static final String QUERY2 = "UPDATE TRAINER SET GENDER='Female' WHERE ID=4;";


	public static void main(String[] args) {
		Connection con =null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded and Registered Successfully! ");
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully! "+con);
		
			Statement stmt= con.createStatement();
		
		//Batch Processing - Executing multiple Queries at a time	
		//(A)Set autoCommit as False
			con.setAutoCommit(false);
		
		//(B) Add tasks to batch
			stmt.addBatch(QUERY1);
			stmt.addBatch(QUERY2);
		 
		//(C) Get count of records affected
			int[] countBatch=stmt.executeBatch();
			for(int count:countBatch) {
				System.out.println(count+" rows affected");
			}
			
			con.commit();
		
		
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
