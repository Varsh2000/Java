package com.marathon;

import java.util.Scanner;

public class MultipleChecker {
	public static void checkMultipleOfTen(int n) 
	{ 
		if(n%10==0) {
			System.out.println(n+" is a multiple of 10");
		}
		else {
			System.out.println(n+" is not a multiple of 10");
		}
	} 
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =sc.nextInt();
		checkMultipleOfTen(n);
	} 


}
