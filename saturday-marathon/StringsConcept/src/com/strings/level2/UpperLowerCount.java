package com.strings.level2;

import java.util.Scanner;

public class UpperLowerCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=new String(sc.next());
		UpperLowerCountApp upc=new UpperLowerCountApp();
		upc.count(s);

	}

}
