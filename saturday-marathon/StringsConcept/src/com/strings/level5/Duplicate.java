package com.strings.level5;

import java.util.Scanner;

import com.strings.level4.ReverseApp;

public class Duplicate {
//Removing Duplicate Characters from a String
//using inbuilt methods
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		System.out.println("Original String Is "+s);
		DuplicateApp duplicate = new DuplicateApp();
		String dup = duplicate.dup(s);
		System.out.println("String after removing duplicate characteres "+dup);

	}

}
