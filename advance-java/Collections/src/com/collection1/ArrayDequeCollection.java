package com.collection1;

import java.util.ArrayDeque;

public class ArrayDequeCollection {
	public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
	ad.add(10);
    ad.add(20.3);
    ad.add("Thirty");
    ad.add(true);
    System.out.println("First="+ad.getFirst());
    System.out.println("Last="+ad.getLast());
    ad.addFirst(111);
    ad.addLast(999);
    System.out.println("First="+ad.getFirst());
    System.out.println("Last="+ad.getLast());
    System.out.println(ad);
	}
}
