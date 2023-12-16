package com.marathon;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=3;i<=num;i++) {
			int res=checkPrime(i);
			if(res!=0) {
				System.out.println(res);
				count++;
			}
		}System.out.println("Number of Prime Number: "+count);
		
	}
	public static int checkPrime(int n) {
		int flag=1;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return 0;
		}
		return n;

	}

}
