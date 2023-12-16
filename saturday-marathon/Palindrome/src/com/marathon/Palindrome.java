package com.marathon;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int n=num;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(num==rev) {
			System.out.println("Reverse of the Number=" +rev);
			System.out.println(+num+ " is a Palindrome");
		}
		else
		{
			System.out.println("Reverse of the Number=" +rev);
			System.out.println(+num +" is not a Palindrome");
		}

	}
}
