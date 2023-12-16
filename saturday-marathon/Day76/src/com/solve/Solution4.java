package com.solve;

public class Solution4 {
	public static void main(String[] args) {
		int bin=100;
		int dec=0;
		int base=1;
		while(bin>0) {
			dec=dec+base*(bin%10);
			base=base*2;
			bin=bin/10;
		}
		System.out.println(dec);

	}
}
