package com.marathon;
import java.util.Scanner;

public class Main 
{
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "p01":System.out.println("COCA COLA");
		break;
		case "p02":System.out.println("THUMPS UP");
		break;
		case "p03":System.out.println("Sprite");
		break;
		default:System.out.println("Mineral Water");
		}
	} 
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Code");
		String productCode=sc.next();
		getProduct(productCode);
	}
}
