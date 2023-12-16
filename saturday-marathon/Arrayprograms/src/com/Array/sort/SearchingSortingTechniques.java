package com.Array.sort;

public class SearchingSortingTechniques {
	void insertionSort(int arr[]) {
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
	void bubbleSort(int arr[]) {
		int help;
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}		
	}
	void selectionSort(int arr[]) {
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
	}
	int linearSearch(int arr[],int target) {
		for(int i=0;i<=arr.length-1;i++) {
			if(target==arr[i]) {
				return i;
			}
		}return -1;		
	}
	int binartSearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}return -1;
	}
}
