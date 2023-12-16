package com.strings.level2;

import java.util.Scanner;

public class LengthChecker {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String1");
	String s1=new String(sc.next());
	System.out.println("Enter String2");
	String s2=new String(sc.next());
	LengthCheckerApp check=new LengthCheckerApp();
	boolean res=check.isLength(s1,s2);
	if(res==true) {
		System.out.println("Strings are of same length");
	}else {
		System.out.println("Strings are of different length");
	}
}
}