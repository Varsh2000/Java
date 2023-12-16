package com.marathon;

import java.util.Scanner;

public class Main {
	public static void checkDiscount(double purchaseAmount)
	{ 
		if (purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount not Applicable");
		}
	} 
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount: ");
		double purchaseAmount=sc.nextDouble();
		checkDiscount(purchaseAmount);

	}

}
