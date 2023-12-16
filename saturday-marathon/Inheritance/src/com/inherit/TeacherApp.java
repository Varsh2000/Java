package com.inherit;

public class TeacherApp {

	public static void main(String[] args) {
		PhysicsTeacher pTeacher=new PhysicsTeacher();
		ChemistryTeacher cTeacher=new ChemistryTeacher();
		BiologyTeacher bTeacher=new BiologyTeacher();
		pTeacher.name="Jeena";
		pTeacher.subject="Physics";
		pTeacher.takeAttendance();
		pTeacher.teach();
		pTeacher.doLabExp();
		System.out.println();
		cTeacher.name="Priya";
		cTeacher.subject="Chemistry";
		cTeacher.takeAttendance();
		cTeacher.teach();
		cTeacher.doChemicalExp();
		System.out.println();
		bTeacher.name="Meera";
		bTeacher.subject="Biology";
		bTeacher.takeAttendance();
		bTeacher.teach();
		bTeacher.doDisectionExp();
		
		

	}

}
