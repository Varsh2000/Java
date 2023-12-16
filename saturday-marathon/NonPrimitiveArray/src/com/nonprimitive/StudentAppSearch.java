package com.nonprimitive;

import java.util.Scanner;

public class StudentAppSearch {

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
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
		}
		System.out.println("Enter Student name to search");
		String nkey=sc.next();
		boolean flag=true;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i].name.equals(nkey)) {
				System.out.println("Student Found");
				flag=true;
				break;
			}
		}
			if(flag==false) {
				System.out.println("Student not Found");
			}
			
		System.out.println("Enter true you want to Sort the array?");
		boolean choice=sc.nextBoolean();
		if(choice==true) {
			for(int i=0;i<=arr.length-2;i++) {
				for(int j=0;j<=arr.length-2-i;j++) {
					if(arr[j].id>arr[j+1].id) {
						Student temp;
						temp=arr[j];//Swap the references of array 
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Sorted Array :");
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
			}
			System.out.println("Enter Student id to search");
			int idkey=sc.nextInt();
			int low=0;
			int high=arr.length-1;
			flag=false;
			while(low<=high) {
				int mid=(low+high)/2;
				if(arr[mid].id==idkey) {
					System.out.println("Student ID Found ");
					flag=true;
					break;
				}
				else if(idkey>arr[mid].id) {
					low=mid+1;
					high=high;
				}
				else {
					high=mid-1;
					low=low;
				}
			}
			
		if(flag==false) {
			System.out.println("ID not Found");
		}

		}
	}

}
