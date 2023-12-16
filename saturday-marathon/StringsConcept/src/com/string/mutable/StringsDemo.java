package com.string.mutable;

public class StringsDemo {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hello");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}

}
