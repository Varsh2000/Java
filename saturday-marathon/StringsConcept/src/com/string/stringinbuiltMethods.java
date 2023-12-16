package com.string;

public class stringinbuiltMethods {

	public static void main(String[] args) {
		String name="Raja Ram Mohan Roy";
		System.out.println(name);
		name.toUpperCase();
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('a'));
		System.out.println(name.indexOf('a',5));
		System.out.println(name.indexOf("Ram"));
		System.out.println(name.indexOf("Ram",3));
		System.out.println(name.contains("Ram"));
		System.out.println(name.contains("ram"));
		System.out.println(name.substring(9));
		System.out.println(name.substring(9,14));
		System.out.println(name.length());
		System.out.println(name.replace("Raja","Raj"));
		System.out.println(name.replaceAll("Raja Ram Mohan Roy","HEllo World how are you"));
		System.out.println(name.replaceFirst("Mohan Roy","HEllo "));
		System.out.println(name.startsWith("Raja"));
		System.out.println(name.endsWith("Raja"));
		System.out.println(name.isEmpty());
		System.out.println(name.toCharArray());
		System.out.println(name.split(""));
		System.out.println(name.trim());
		
	}

}
