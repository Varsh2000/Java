package com.marathon;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		Gcd gcd=new Gcd();
		int res=gcd.findGcd(m, n);
		System.out.println("GCD of "+m+" and "+n+" = "+res);
	}

}
