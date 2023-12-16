package com.strings.level5;

import java.util.Scanner;

public class Substring {
	// Display All Substrings of a Given String
	//using inbuit method
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i;j<=s.length();j++) {
				String s1=s.substring(i,j);
				System.out.println(s1+" ");
			}

	}

}
}
