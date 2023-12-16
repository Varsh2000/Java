package com.Array.level2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Array Contents before Swapping");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 2 indexes:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Array Contents before Swapping");
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		for(int i:arr) {
			System.out.println(i+" ");
		}
			
	}		
}
		
