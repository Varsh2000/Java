package com.marathon;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int n=num;
		int r=0;
		while(n!=0) {
			int rem=n%10;
			r=r+(rem*rem*rem);
			n=n/10;
		}
		if(num==r) {
			System.out.println("Result = " +r);
			System.out.println(+num+ " is a Armstrong Number");
		}
		else
		{
			System.out.println("Result =" +r);
			System.out.println(+num +" is not an Armstrong Number");
		}
	}

}
