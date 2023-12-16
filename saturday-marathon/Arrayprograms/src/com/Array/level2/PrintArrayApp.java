package com.Array.level2;

import java.util.Scanner;

public class PrintArrayApp {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Length: ");
			int arr[]=new int[sc.nextInt()];
			System.out.println("Enter Array Contents");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=sc.nextInt();
			}
			PrintArray pArray=new PrintArray();
			pArray.printArray(arr);
	}


}
