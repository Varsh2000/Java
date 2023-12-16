package com.strings.level5;

import java.util.Scanner;

public class Replace {
	//Replace Space with 99
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		s=s.replace("", "99");
		System.out.println(s);

	}

}
