package com.collection1;

import java.util.*;

public class UpcastingCollection {
	public static void main(String[] args) {
		List list1=new ArrayList<>();
        list1.add(10);
        list1.add(50);
        list1.add(40);
        List list2=new LinkedList();
		list2.add(10);
        list2.add(50);
        list2.add(40);
        Queue ad=new ArrayDeque();
    	ad.add(10);
        ad.add(20.3);
        ad.add("Thirty");
        Queue pq = new PriorityQueue();
		pq.add("Two");
	    pq.add("Twenty");
	    pq.add("Thirty");
	    System.out.println(list1);
	    System.out.println(list2);
	    System.out.println(ad);
	    System.out.println(pq);
	    
	}
}
