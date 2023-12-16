package com.string;

import java.util.Scanner;

public class charArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Array Length");
		char[] arr=new char[sc.nextInt()];
		System.out.println("Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.next().charAt(0);
		}
		System.out.print("Arr 1--->");
		for(char ch:arr) {
			System.out.print(ch+" | ");
		}
		char[] arr2=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
		}
		System.out.println();
		System.out.print("Arr 2--->");
		for(char ch :arr) {
			System.out.print(ch+" | ");
		}
		char[] arr3=new char[arr.length];
		int j=arr3.length-1;
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[j]=arr2[i];
			j--;
		}
		System.out.println();
		System.out.println("Arr 3--->");
		for(char ch:arr3) {
			System.out.print(ch+" | ");
		}

	}

}
