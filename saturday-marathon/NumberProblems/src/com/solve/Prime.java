package com.solve;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int flag = 1;
		for( int i=2;i*i<n;i++) {
			if(i%n==0)
				flag=0;
		}
		if(flag==0) {
			System.out.println(n+" is not Prime Number");
		}
		else {
			System.out.println(n+" is Prime Number");
		}
}
}
