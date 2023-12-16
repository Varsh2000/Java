package com.inherit;

public class Teacher {
	String name;
	String subject;
	public void takeAttendance() {
		System.out.println(name+" teacher is taking attendance");
	}
	public void teach() {
		System.out.println(name+" teacher is teaching "+subject);
	}

}
