package com.inherit;

public class Robo4ptO {

	public static void main(String[] args) {
		TeacherRobo tRobo=new TeacherRobo();
		ChefRobo cRobo=new ChefRobo();
		DriverRobo dRobo=new DriverRobo();
		tRobo.name="Chitti";
		tRobo.type="Humanoid";
		tRobo.talk();
		tRobo.walk();
		tRobo.charge();
		tRobo.teach();
		System.out.println();
		cRobo.name="Amy";
		cRobo.type="HumanFenoid";
		cRobo.talk();
		cRobo.walk();
		cRobo.charge();
		cRobo.cook();
		System.out.println();
		dRobo.name="Will";
		dRobo.type="AndroBrainoid";
		dRobo.talk();
		dRobo.walk();
		dRobo.charge();
		dRobo.drive();

	}

}
