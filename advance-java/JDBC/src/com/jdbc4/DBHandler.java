package com.jdbc4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {
	private static final String QUERY="INSERT INTO STUDENT (NAME,MARKS) VALUES(?,?);";

	public static void  insertData(Connection con,Student s) {
		String name=s.getName();
		int marks=s.getMarks();
		try {
			PreparedStatement psmt = con.prepareStatement(QUERY);
			psmt.setString(1, name);
			psmt.setInt(2, marks);
			int count=psmt.executeUpdate();
			System.out.println(count+" rows affected");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


