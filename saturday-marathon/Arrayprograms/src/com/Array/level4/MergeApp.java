package com.Array.level4;

import java.util.Scanner;

public class MergeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter Array1 Elements");
		for(int i=0;i<=arr1.length-1;i++){
		   arr1[i]=scan.nextInt();
		}
		System.out.println("Enter Array2 Length");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter Array2 Elements");
		for(int i=0;i<=arr2.length-1;i++){
			   arr2[i]=scan.nextInt();
		}
		System.out.print("Array1===> ");
		for (int x : arr1) {
		System.out.print(x+" ");
		}System.out.println();
		System.out.print("Array2===> ");
		for (int x : arr2) {
		System.out.print(x+" ");
		}
		System.out.println();
		
		Merge mer=new Merge();
		int res[]=mer.merge(arr1,arr2);
		System.out.print("Array3===> ");
		for (int x : res) {
		System.out.print(x+" ");
		}

	}

}
