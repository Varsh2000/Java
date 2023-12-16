package com.collection1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BackwardTraversingNonList {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
	    ad.add(20);
	    ad.add(98);
	    ad.add(true);
	    
	    //using descendingIterator
	    Iterator itr=ad.descendingIterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next()+" ");
        }

	}

}
