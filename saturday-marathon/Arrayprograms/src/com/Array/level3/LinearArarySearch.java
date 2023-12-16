package com.Array.level3;

import java.util.Scanner;

public class LinearArarySearch {
	public static void main(String[] args) 	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Target Element");
		int t=sc.nextInt();
		LinearSearch search=new LinearSearch();
		boolean res= search.isPresent(arr,t);
		if(res==true) {
			System.out.println("Target Found");
		}
		else {
			System.out.println("Target Not Found");
		}
	}
}

