package com.marathon;

import java.util.Scanner;

public class MultipleChecker2 {
	public static void checkMultiple(int n,int m) 
	{ 
		if(n%m==0) {
			System.out.println(n+" is a multiple of "+m);
		}
		else {
			System.out.println(n+" is not a multiple of "+m);
		}
	} 
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n =sc.nextInt();
		int m=sc.nextInt();
		checkMultiple(n,m);
	} 
}
