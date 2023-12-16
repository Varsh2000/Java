package com.strings.level5;

public class DuplicateApp {
	String dup(String s){
	    String s2="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s2.contains(String.valueOf(s.charAt(i)))==false){
			//if(!s2.contains(String.valueOf(s.charAt(i))))
					s2=s2+s.charAt(i);			
			}
		}
		return s2;
	
	}
}
