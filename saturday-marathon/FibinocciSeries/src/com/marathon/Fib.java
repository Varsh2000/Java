package com.marathon;

import java.util.Scanner;

public class Fib {

public	void fibinocci(int n) {
		int n1=0;
		int n2=1;
		if(n==1) {
			System.out.print(n1);
		}
		else if(n==2) {
			System.out.print(n1+", "+n2);
		}
		else {
			System.out.print(n1+", "+n2);
			for(int i=3;i<=n;i++) {
				int next=n1+n2;
				System.out.print(", "+next);
				n1=n2;
				n2=next;
			}
		}
	}
	}


