package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticActivities {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		add();
		sub();
		try {
			mul();
		}catch(InputMismatchException e) {
			System.out.println("Exception handled in main()");
		}
		try {
			div();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled in main()");
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatch Exception handled in main()");
		}	

	}

	private static void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum="+c);

	}

	private static void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a-b;
			System.out.println("Difference="+c);
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Handled...");
		}

	}

	private static void mul() throws InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("Product="+c);

	}

	private static void div() throws ArithmeticException,InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Quotient="+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled in div()");

			throw e;
		}	
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception Handled in div()");
			throw e;
		}

	}

}
