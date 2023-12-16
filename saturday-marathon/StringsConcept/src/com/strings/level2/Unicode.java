package com.strings.level2;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		String s=new String(sc.next());
		UnicodeApp unicode=new UnicodeApp();
		unicode.print(s);

	}

}
