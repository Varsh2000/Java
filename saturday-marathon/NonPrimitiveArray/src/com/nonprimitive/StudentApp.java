package com.nonprimitive;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number of objects");
		Student arr[]=new Student[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Marks");
			int marks=sc.nextInt();
			arr[i]=new Student(id,name,marks);
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
		}
	}

}
