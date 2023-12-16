package com.collection.sort4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"ABC",35000);
		Employee e2=new Employee(4,"VFF",66000);
		Employee e3=new Employee(3,"XYS",45000);
		
		ArrayList<Employee> l1=new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		System.out.println("Before Sorting");
		System.out.println(l1);
		System.out.println();
		System.out.println("Sorting based of Employee ID (Ascending)");
		Collections.sort(l1,new Comparator<Employee>() {			
			public int compare(Employee e1, Employee e2) {
				return Integer.compare(e1.empId,e2.empId);
			}
		});		
		System.out.println("After Sorting");
		System.out.println(l1);
		System.out.println();
		System.out.println("Sorting based of Employee ID (Descending)");
		Collections.sort(l1,new Comparator<Employee>() {			
			public int compare(Employee e1, Employee e2) {
				return Integer.compare(e2.empId,e1.empId);
			}
		});
		System.out.println("After Sorting");
		System.out.println(l1);
		System.out.println();
		System.out.println("Sorting based of Employee Name (Ascending)");
		Collections.sort(l1,new Comparator<Employee>() {			
			public int compare(Employee e1, Employee e2) { 
					return e1.empName.compareTo(e2.empName);
		}}			
		);
		System.out.println("After Sorting");
		System.out.println(l1);
		System.out.println();
		System.out.println("Sorting based of Employee Name (Descending)");
		Collections.sort(l1,new Comparator<Employee>() {			
			public int compare(Employee e1, Employee e2) {
					return e2.empName.compareTo(e1.empName);			
			}
		});
		System.out.println("After Sorting");
		System.out.println(l1);
		System.out.println();
		System.out.println("Sorting based of Employee Salary (Ascending)");
		Collections.sort(l1,new Comparator<Employee>() {			
			public int compare(Employee e1, Employee e2) {
				return Double.compare(e1.salary, e2.salary);
			}
		});
		System.out.println("After Sorting");
		System.out.println(l1);
		System.out.println();
		System.out.println("Sorting based of Employee Salary (Descending)");
		Collections.sort(l1,new Comparator<Employee>() {			
			public int compare(Employee e1, Employee e2) {
				return Double.compare(e2.salary, e1.salary);
				
			}
		});
		System.out.println("After Sorting");
		System.out.println(l1);

	}


}
