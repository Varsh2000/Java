package com.solve;

public class Solution3 {
	public static void main(String[] args) {
		int num=44;
		String br="";
		while(num>0) {
			int rem=num%2;
			br=br+rem;
			num=num/2;
		}
		System.out.println(br);

	}
}
