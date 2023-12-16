package com.encapsule;

import java.io.ObjectInputStream.GetField;

public class StudentApp {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setName("Raju");
		student.setMarks(99);
		student.setGender("Male");
		System.out.println(student.getId()+" "+student.getName()
				+" "+student.getMarks()+" "+student.getGender());

	}

}
