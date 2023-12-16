package com.marathon;

public class Gcd {
//No need to declare method as static as we return it in separate classes
	int findGcd(int m,int n) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}int gcd=m;
		return gcd;
	}
}
