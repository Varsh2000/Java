package com.marathon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial = "+fact(n));
				

	}
	public static int fact(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}return fact;
	}

}