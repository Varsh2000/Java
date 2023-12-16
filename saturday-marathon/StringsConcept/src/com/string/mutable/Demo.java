package com.string.mutable;

public class Demo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rama");
		sb.append("Sita");
		System.out.println(sb);
		
		StringBuilder strb=new StringBuilder("Ravana");
		strb.append(" Asura");
		System.out.println(strb);

	}

}
