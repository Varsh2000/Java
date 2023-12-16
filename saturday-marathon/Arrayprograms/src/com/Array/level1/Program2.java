package com.Array.level1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Array Contents");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Contents Incremented by 5");
		for(int a: arr) {
			System.out.println(a+5);
		}System.out.println();
	}

}
