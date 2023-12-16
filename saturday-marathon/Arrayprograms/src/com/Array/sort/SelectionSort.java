package com.Array.sort;

import java.util.Scanner;

public class SelectionSort {
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
		
		//SELECTION SORT LOGIC
		int min;
		int pos;
		int help;
		for(int i=0;i<=arr.length-2;i++) {
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
		System.out.println("Array Elements after sorting");
		for(int x:arr) {
			System.out.print(x+ " ");
		}
	}
	}
