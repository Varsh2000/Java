package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {
	
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static  final String PASSWORD = "system";
	//private static final String CREATE_STUDENT_QUERY ="Create table Student2(ID int,NAME varchar(20),MARKS int);";
	//private static final String INSERT_QUERY = "INSERT INTO Student2 VALUES(1,'Hari',77);";
	//private static final String INSERT_QUERY = "INSERT INTO Student2 VALUES(2,'Meera',97);";
	//private static final String UPDATE_QUERY="UPDATE Student2 set NAME='Sree Hari' where NAME='Hari';";
	//private static final String DELETE_QUERY="DELETE FROM Student2 where id=1;";
	private static final String SELECT_QUERY="SELECT * FROM STUDENT2;";
	
	public static void main(String[] args) {
	 Connection con=null;
		try {
			//1. Load and Register Driver		}
			Class.forName("com.mysql.cj.jdbc.Driver");
			//FQCN(Fully Qualified Class Name)==>Canonical Name
			System.out.println("Driver Loaded and Registered Successfully! ");

			//2.Establish Connection
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully! "+con);

			//3.Create Statement Object
			Statement stmt = con.createStatement();

			//4.Send and Execute Query			
			//stmt.execute(CREATE_STUDENT_QUERY);
			System.out.println("Student Table Created Successfully");
			//int rowsAffected=stmt.executeUpdate(INSERT_QUERY);
			//int rowsAffected=stmt.executeUpdate(UPDATE_QUERY);
			//int rowsAffected=stmt.executeUpdate(DELETE_QUERY);
			ResultSet rs=stmt.executeQuery(SELECT_QUERY);
			while(rs.next()) {
				System.out.println("ID = "+ rs.getInt(1)
						+", Name = "+rs.getString(2)
						+", Marks = "+rs.getInt(3));
			}
			//System.out.println(rowsAffected+ " rows affected");

		}  catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to Establish Connection");
			e.printStackTrace();
		}	
		finally {
			//5.Close the connection
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
