package com.recurssion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		FactApp factorial=new FactApp();
		int res=factorial.fact(n);
		System.out.println("Factorial of "+n+" = "+res);

	}

}
