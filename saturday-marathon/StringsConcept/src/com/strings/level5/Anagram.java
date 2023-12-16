package com.strings.level5;

import java.util.Scanner;

public class Anagram {
//eg: CAT, ACT : Are Anagram
//Frequency of characters in both strings should be equal

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scan.nextLine();
		System.out.println("Enter a String");
		String s2=scan.nextLine();
		if(s1.length()==s2.length()) {
		AnagramApp Anagram = new AnagramApp();
		Boolean res=Anagram.check(s1,s2);
		if(res==true) {
			System.out.println("String "+s1+" and "+s2+" are anagram.");
		}
		else {
			System.out.println("String "+s1+" and "+s2+" are not anagram.");
		}
		}
		else {
			System.out.println("String are not anagram.");
		}
	}

}
