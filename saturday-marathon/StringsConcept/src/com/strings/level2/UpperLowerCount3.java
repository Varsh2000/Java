package com.strings.level2;

import java.util.Scanner;

public class UpperLowerCount3 {// without using charAt
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=new String(sc.next());
		int ucount=0;
		int lcount=0;			
		for(int i=0;i<=s.length()-1;i++) {
			char []arr=s.toCharArray();					
			if(arr[i]>=97 && arr[i]<=122) {
				lcount++;
			}
			else {
				ucount++;
			}
		}
		System.out.println("Upper Case count:"+ucount);
		System.out.println("Lower Case count:"+lcount);
	}
}