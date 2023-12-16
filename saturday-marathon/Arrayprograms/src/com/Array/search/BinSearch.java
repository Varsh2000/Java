package com.Array.search;

import java.util.Scanner;

public class BinSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Key");
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		if(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("Key Found at "+mid+" index");
			}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else{
				System.out.println("Key not Found");
			}
		}
	}		
}

