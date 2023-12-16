package com.strings.level2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(sc.next());
		System.out.println("Before Reversing===> "+s1);
		
		
		PalindromeApp pali=new PalindromeApp();
		boolean res=pali.isPalindrome(s1);
		if(res==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}
		

	}

}
