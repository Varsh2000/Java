package com.string;

public class Demo1 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="RAMA";
		if(s1==s2) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are not Equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}

	}

}
