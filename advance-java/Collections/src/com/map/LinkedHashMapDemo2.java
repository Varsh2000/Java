package com.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import com.collection.sort3.Student;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap map=new LinkedHashMap<>();
		map.put(1, 300);
		map.put(2, new Student(1,"Akash",4.5));
		map.put(3, 300);
		map.put("Four", 700);
		map.put(5, 800);
		System.out.println(map);
		
		Set keys=map.keySet();
		System.out.println(keys);
		
		Set kv=map.entrySet();
		System.out.println(kv);
		
		Collection values=map.values();
		System.out.println(values);

	}

}
