package com.strings.level4;

import java.util.Scanner;

public class Reverse {
	//Reversing Each Word Of A String
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Original String Is "+str);
		ReverseApp reverse = new ReverseApp();
		String Reverse = reverse.wordReverse(str);
		System.out.println("Reversed String Is "+Reverse);

	}
}


