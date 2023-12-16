package com.multilevel;

public class VehicleApp {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.regno=1223;
		v.move();
		System.out.println();
		Car c=new Car();
		c.regno=6783;
		c.move();
		System.out.println();
		Sedan s=new Sedan();
		s.regno=9993;
		s.move();

	}

}
