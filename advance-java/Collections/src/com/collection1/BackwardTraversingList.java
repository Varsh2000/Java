package com.collection1;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackwardTraversingList {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
        list1.add(10);
        list1.add(50);
        list1.add(40);
        
        //using ListIterator
        ListIterator<Integer> itr=list1.listIterator(list1.size());
        
        while(itr.hasPrevious()) {
        	System.out.println(itr.previous()+" ");
        }
	}

}
