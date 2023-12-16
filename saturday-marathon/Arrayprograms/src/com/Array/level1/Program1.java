package com.Array.level1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter array contents: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}System.out.println("The Array Contents are: ");
		for (int i: arr) {
			System.out.println(i);
		}System.out.println();
	}

}
