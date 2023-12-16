package com.Array.level4;

import java.util.Scanner;

public class ReplaceApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++){
		   arr[i]=scan.nextInt();
		}
		System.out.println("Array====>");
		for(int i:arr){
		   System.out.print(i+" ");
		}System.out.println();
		Replace rep=new Replace();
		rep.replace(arr);
		System.out.println("Resultant Array====>");
		for(int i:arr){
		   System.out.print(i+" ");
		}

	}

}
