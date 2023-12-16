package com.marathon;

import java.util.Scanner;

public class FibApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Fib fib=new Fib() ;
		fib.fibinocci(n);
	}
}
