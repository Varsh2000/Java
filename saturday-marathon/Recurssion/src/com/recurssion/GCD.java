package com.recurssion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GcdApp GCD=new GcdApp();
		int res=GCD.gcd(m,n);
		System.out.println("GCD of "+m+" and "+n+" = "+res);


	}

}
