package com.collection1;


import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		list1.add(10);
        list1.add(50);
        list1.add(40);
        list1.add(10);
        LinkedList list2=new LinkedList();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        System.out.println("List1 = "+list1);
        System.out.println("Size of List1 = "+list1.size());
        System.out.println("List2 = "+list2);
        System.out.println("Size of List2 = "+list2.size());
        System.out.println("Data at Index(2)= "+list1.get(2));
        System.out.println("IndexOf(10)="+list1.indexOf(10));
        System.out.println("LastIndexOf(10)="+list1.lastIndexOf(10));
        list1.add(2, 30);
        System.out.println("List1 = "+list1);
        list1.set(1, 20);
        System.out.println("List1 = "+list1);
        list2.add(list1);
        System.out.println(list2);

	}

}
