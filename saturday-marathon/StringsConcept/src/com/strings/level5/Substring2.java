package com.strings.level5;

import java.util.Scanner;

public class Substring2 {
	// Display All Substrings of a Given String
	//without using inbuit method
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		for(int i=0;i<=s.length()-1;i++) {
			String temp="";
			for(int j=i;j<=s.length()-1;j++) {
				temp=temp+s.charAt(j);
				System.out.println(temp+" ");
			}

	}

}
}
