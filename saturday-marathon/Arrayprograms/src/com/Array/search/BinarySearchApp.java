package com.Array.search;

import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
	 	}
		BinarySearch bSearch=new BinarySearch();
		System.out.println("Enter the key");
		int key=sc.nextInt();
		int res=bSearch.search(arr,key);
		if(res>=0) {
			System.out.println("Key found at Index "+res);
		}
		else {
			System.out.println("Key not found");
		}
		
		
	}		

}



