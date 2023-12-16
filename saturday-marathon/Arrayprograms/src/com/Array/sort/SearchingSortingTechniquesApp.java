package com.Array.sort;

import java.util.Scanner;

public class SearchingSortingTechniquesApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Length");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are");
		for(int x:arr) {
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("1--->Bubble Sort");
		System.out.println("2--->Selection Sort");
		System.out.println("3--->Insertion Sort");
		System.out.println("Any Other--->Selection Sort");
		int choice=sc.nextInt();
		SearchingSortingTechniques sort=new SearchingSortingTechniques();
		switch(choice) {
		case 1: sort.bubbleSort(arr);
			break;
		case 2: sort.selectionSort(arr);
		break;
		case 3: sort.insertionSort(arr);
		break;
		default:sort.selectionSort(arr);
		}

		System.out.println("Array Elements after sorting");
		for(int x:arr) {
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("Enter key to Search using BinarySearch");
		int key=sc.nextInt();
		int res=sort.binartSearch( arr,key);
		if(res>=0) {
			System.out.println("Key found at Index "+res);
		}
		else {
			System.out.println("Key not found");
		}
		}
}
