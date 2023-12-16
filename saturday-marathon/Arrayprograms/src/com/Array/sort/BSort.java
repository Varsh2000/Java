package com.Array.sort;

import java.util.Scanner;

public class BSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Length");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements before sorting");
		for(int x:arr) {
			System.out.print(x+ " ");
		}
		System.out.println();
		BSortApp sort=new BSortApp();
		sort.BSort(arr);
		System.out.println("Array Elements after sorting");
		for(int x:arr) {
			System.out.print(x+ " ");
		}
	}
	}