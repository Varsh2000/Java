package com.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(sc.next());
		System.out.println("Before Reversing===> "+s1);
		char arr1 []=s1.toCharArray();
		char arr2[] =new char[arr1.length];
		int j=arr2.length-1;
		for	(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		s1=new String(arr2);
		System.out.println("After Reverse==> "+s1);
		
	}

}
