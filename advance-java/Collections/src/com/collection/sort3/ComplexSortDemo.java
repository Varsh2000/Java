package com.collection.sort3;

import java.util.ArrayList;
import java.util.Collections;

import com.collection.sort3.Student;

public class ComplexSortDemo {

	public static void main(String[] args) {
		Student s1=new Student(1,"ABC",35.3);
		Student s2=new Student(5,"VFF",66.8);
		Student s3=new Student(3,"XYS",45.8);
		
		ArrayList<Student> l1=new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		System.out.println("Before Sorting");
		System.out.println(l1);
		SortStudentById s=new SortStudentById();
		Collections.sort(l1,s);
		System.out.println("After Sorting");
		System.out.println(l1);

	}

}
