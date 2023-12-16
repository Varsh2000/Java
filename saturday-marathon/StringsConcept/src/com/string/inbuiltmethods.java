package com.string;

public class inbuiltmethods {

	public static void main(String[] args) {
		String s1="Raja Ram Mohan Roy";
		System.out.println(s1.length());
		s1=s1.replace('R', 'A');
		System.out.println(s1);
		s1=s1.replaceAll("Aaja", "Raja");
		System.out.println(s1);
		System.out.println();
		String str=new String("Omkar");
		String st=str.intern();
		System.out.println(st);
		String st1="Omkar";
		if(st==st1) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are Unequal");
		}
		System.out.println();
		String string=new String("Ravana Brahma");
		char arr[]=string.toCharArray();
		int i=0;
		do {
			System.out.print(arr[i]+" | ");
			i++;
		}while(i<=arr.length-1);

	}

}
