package com.map;

import java.util.*;

import com.collection.sort3.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap<>();
		map.put(1, 300);
		map.put(2, new Student(1,"Akash",4.5));
		map.put(3, 300);
		map.put("Four", 700);
		map.put(5, 800);
		System.out.println(map);

	}

}
