package com.marathon;

import java.util.Scanner;

public class Main {

	public static void identifyPolygon(int sides)
	{
		if(sides>1) {
			if(sides==2) {
				System.out.println("Line");
			}
			else if(sides==3) {
				System.out.println("Triangle");
			}
			else if(sides==4) {
				System.out.println("Quadrilateral");
			}
			else if(sides==5) {
				System.out.println("Pentagon");
			}
			else if(sides==6) {
				System.out.println("Hexagon");
			}
			else {System.out.println("Polygon");

			}
		}
		else {
			System.out.println("Not a polygon.Enter valid no.of sides");
		}
	}
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of sides");
		int sides=sc.nextInt();
		identifyPolygon(sides) ;
	} 
}
