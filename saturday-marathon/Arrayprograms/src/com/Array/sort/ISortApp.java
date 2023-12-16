package com.Array.sort;

public class ISortApp {
	void ISort(int arr[]) {

	//INSERTION SORT LOGIC
	int item;
	for(int i=0;i<=arr.length-1;i++) {
		item=arr[i];
		int j=i-1;		
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
			}
			arr[j+1]=item;
		}
	}
}
