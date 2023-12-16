package com.string;

public class Immutable {

	public static void main(String[] args) {
		String s1="RAMA";
		System.out.println(s1);
		String s2="SITA";
		System.out.println(s2);
		s1.concat(s2);
		System.out.println(s1);
		s1=s1.concat(s2);
		System.out.println(s1);

	}

}
