package com.marathon;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Sum = "+sum(a));
				

	}
	public static int sum(int a) {
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum=sum+i;
		}
		return sum;
	}

}
