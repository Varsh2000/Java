package com.string.mutable;

public class capacity {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Sachin is a batsman");
		System.out.println(sb.capacity());
		sb.append("He lives in Mumbai");
		System.out.println(sb.capacity());
		System.out.println();
		StringBuilder strb=new StringBuilder();
		System.out.println(strb.capacity());
		strb.append("Saurav is a batsman");
		System.out.println(strb.capacity());
		strb.append("He lives in Mumbai");
		System.out.println(strb.capacity());

	}

}
