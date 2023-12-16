package com.Array.level4;

import java.util.Scanner;

/**
 * 
 */
public class ArraysSumApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr1[]=new int[scan.nextInt()];
		int arr2[]=new int[arr1.length];
		System.out.println("Enter Array1 Elements");
		for(int i=0;i<=arr1.length-1;i++){
		   arr1[i]=scan.nextInt();
		}
		System.out.println("Enter Array2 Elements");
		for(int i=0;i<=arr2.length-1;i++){
			   arr2[i]=scan.nextInt();
		}
		System.out.println("Array1====>");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println("Array2====>");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		ArraysSum sum=new ArraysSum();
		int res[]=sum.arraySum(arr1,arr2);
		System.out.println("Sum Array====>");
		for(int i:res) {
			System.out.print(i+" ");
		}
	}

}
