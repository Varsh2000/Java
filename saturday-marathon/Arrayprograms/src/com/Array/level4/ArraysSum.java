package com.Array.level4;

public class ArraysSum {
	int[] arraySum(int arr1[],int arr2[]) {
		int res[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			res[i]=arr1[i]+arr2[i];
		}
		return res;
	}

}
