package com.Array.level4;

import java.util.Scanner;

public class ElementsSumApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++){
		   arr[i]=scan.nextInt();
		}
		ElementsSum sum=new ElementsSum();
		int res=sum.findSum(arr);
		System.out.println("Sum of elements in Array = "+res);

	}

}
