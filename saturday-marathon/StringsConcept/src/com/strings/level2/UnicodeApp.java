package com.strings.level2;

public class UnicodeApp {
	void print(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			System.out.print(s.charAt(i)+" ");
		}System.out.println();
		for(int i=0;i<=s.length()-1;i++) {
			int unicode=(int)s.charAt(i);
			System.out.print(unicode+" ");
		}
	}

}
