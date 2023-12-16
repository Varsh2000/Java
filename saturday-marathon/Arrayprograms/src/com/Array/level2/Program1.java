package com.Array.level2;

import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Array Contents");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}System.out.println("Array Contents are");
		for(int i : arr) {
			if(i>=0) {
				System.out.println(i);
			}
			
		}

	}

}
