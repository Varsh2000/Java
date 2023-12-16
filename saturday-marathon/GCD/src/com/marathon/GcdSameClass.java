package com.marathon;

import java.util.Scanner;

public class GcdSameClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int res=findGcd(m, n);
		System.out.println("GCD of "+m+" and "+n+" = "+res);
	}
	//In same class we provide static method
	static int findGcd(int m,int n) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}int gcd=m;
		return gcd;
	}
}
