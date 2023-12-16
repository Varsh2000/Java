package com.Array.level4;

public class Replace {
	int []replace(int arr[]){
		int res[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}return arr;
	}

}
