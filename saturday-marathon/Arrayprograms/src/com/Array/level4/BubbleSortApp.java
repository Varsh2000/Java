package com.Array.level4;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}System.out.println();
		BubbleSort bsort=new BubbleSort();
		bsort.sort(arr);
		System.out.println("Array After Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
