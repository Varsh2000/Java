package com.string;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String s1=new String("Rama");
		String s2=new String("RAMA");
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
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}


	}

}
