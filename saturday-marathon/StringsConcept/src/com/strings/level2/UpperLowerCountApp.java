package com.strings.level2;

public class UpperLowerCountApp {
	void count(String s) {
		int ucount=0;
		int lcount=0;	
		for(int i=0;i<=s.length()-1;i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				lcount++;
			}
			else {
				ucount++;
			}
		}
		System.out.println("Upper Case count:"+ucount);
		System.out.println("Lower Case count:"+lcount);
	}
}



