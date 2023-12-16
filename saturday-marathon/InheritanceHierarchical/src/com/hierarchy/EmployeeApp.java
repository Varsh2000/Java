package com.hierarchy;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Tharun";
		e.salary=40000;
		e.details();
		System.out.println();
		Manager m=new Manager();
		m.name="Rahul";
		m.salary=100000;
		m.details();
		System.out.println();
		Developer d=new Developer();
		d.name="Anand";
		d.salary=150000;
		d.details();
		System.out.println();
		Tester t=new Tester();
		t.name="Abhi";
		t.salary=560000;
		t.details();
		System.out.println();
		TeamLead tl=new TeamLead();
		tl.name="Varun";
		tl.salary=200000;
		tl.details();
		

	}

}
