package com.strings.level5;

import java.util.Scanner;

public class Frequency {
//Frequency of each character in a string
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
			char[] arr = s.toCharArray();
			for(int i=0;i<=arr.length-1;i++)
			{
			int count=1;
			if(arr[i]!=' ')
			{
			for(int j=i+1;j<=arr.length-1;j++)
			{
			if(arr[i]==arr[j])
			{
			count++;
			arr[j]=' ';
			}
			}
			System.out.println(arr[i]+" ====> "+count);
			}
			}

	}

}
