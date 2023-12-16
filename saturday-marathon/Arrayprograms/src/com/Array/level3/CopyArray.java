package com.Array.level3;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		int cpy[]=new int[arr.length];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++){
		   arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++){
			cpy[i]=arr[i];
		}
		System.out.println("Original Array Elements");
		for(int i:arr){
		   System.out.println(i);
		}
		System.out.println("New Array Elements");
		for(int i:cpy){
		   System.out.println(i);
		}
	}

}
