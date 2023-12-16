package com.string;

public class Demo4 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		String s4="RAMA"+"SITA";
		if(s3==s4) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are not Equal");
		}
		if(s3.equals(s4)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}
	}

}
