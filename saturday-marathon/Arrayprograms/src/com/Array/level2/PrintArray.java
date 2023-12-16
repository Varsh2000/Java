package com.Array.level2;

public class PrintArray {
	public void printArray(int arr[]) {
		System.out.println("Array Contents in Forward Direction");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println("Array Contents in Reverse Direction");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+ " ");
		}
	}
}
