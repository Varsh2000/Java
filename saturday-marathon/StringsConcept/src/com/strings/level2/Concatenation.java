package com.strings.level2;

import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		String s1=new String(sc.next());
		System.out.println("Enter String2");
		String s2=new String(sc.next());
		
		ConcatenationApp concat=new ConcatenationApp();
		String res=concat.concat(s1, s2);
		if(res!=null) {
			System.out.println("Concatenated string "+res);
		}
		else {
			System.out.println("Strings are not same");
		}
}
}
