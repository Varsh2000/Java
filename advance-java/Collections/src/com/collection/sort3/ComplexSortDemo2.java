package com.collection.sort3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComplexSortDemo2{

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
		Collections.sort(l1,new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if(s1.id>s2.id) {
					return 1;			
				}else if(s1.id<s2.id) {
					return -1;
				}else {
				return 0;
				}
			}
		});
		System.out.println("After Sorting");
		System.out.println(l1);

	}

}

