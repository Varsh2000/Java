package com.strings.level2;

import java.util.Scanner;

public class UpperLowerCount2 {//without in-built method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=new String(sc.next());
		int ucount=0;
		int lcount=0;		
		for(int i=0;i<=s.length()-1;i++) {
			int ch=s.charAt(i);
			if(ch>=97 && ch<=122) {
				lcount++;
			}
			else {
				ucount++;
			}
		}
		System.out.println("Upper Case count:"+ucount);
		System.out.println("Lower Case count:"+lcount);
}
}
