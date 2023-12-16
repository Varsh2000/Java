package com.strings.level3;

import java.util.Scanner;

public class ReverseString {//Preserve whiteSpaces

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=new String(sc.nextLine());
		char []arr=s.toCharArray();
		char[] rev=new char[arr.length];
		System.out.print("String Before Reverse===> ");
		System.out.println(s);
		for(int i=0;i<=arr.length-1;i++) {			
			if(arr[i]==' ')
			{
			rev[i]=arr[i];
			}
		}

		int j=rev.length-1;
		for(int i=0;i<=arr.length-1;i++) {			
			if(arr[i]!=' ')
			{
				if(rev[j]==' ')
				{
					j--;
				}
				rev[j]=arr[i];
				j--;
			}
		}			
		System.out.print("String After Reverse===>");
		System.out.println(rev);
	}
}
