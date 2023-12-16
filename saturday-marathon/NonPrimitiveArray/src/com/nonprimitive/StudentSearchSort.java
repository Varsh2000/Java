package com.nonprimitive;

import java.util.Scanner;

public class StudentSearchSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of objects");
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
		StudentSearchSortApp.studentArrayPrint(arr);
		System.out.println();
		System.out.println("Enter name to search");
		String nameKey=sc.next();
		boolean res=StudentSearchSortApp.studentLinearSearch(arr, nameKey);
		if(!res)
		{
			System.out.println("Student not found");
		}
		System.out.println();
		System.out.println("Enter true if you wish to sort else enter false");
		boolean choice=sc.nextBoolean();
		if(choice)
		{
			StudentSearchSortApp.studentBubbleSort(arr);
		}
		StudentSearchSortApp.studentArrayPrint(arr);
		System.out.println();
		System.out.println("Enter Id to search");
		int idKey=sc.nextInt();
		res=StudentSearchSortApp.studentBinarySearch(arr, idKey);
		if(!res)
		{
			System.out.println("Student not found");
		}
		System.out.println("Rate The Application....out of 10");
		int noofstars=sc.nextInt();
		System.out.println("Thanks For Rating Us With ");
		StudentSearchSortApp.studentAppRatingPrint(noofstars);
	}

}


