package com.string;

public class compareTo {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Saurav";
		if(s1.compareTo(s2)>0) {
			System.out.println("String s1 is greater than s2");
		}else if(s1.compareTo(s2)<0){
			System.out.println("String s2 is greater than s1");
		}else {
			System.out.println("Strings are equal");
		}

	}

}
