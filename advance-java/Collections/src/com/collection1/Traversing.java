package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class Traversing {

	public static void main(String[] args) {
		ArrayList<Object> list1=new ArrayList<>();
        list1.add("Shirt");
        list1.add("Jeans");
        list1.add("Cap");
        list1.add(10);
        list1.add(true);
        
        //using for loop
        for(int i=0;i<list1.size();i++) {
        	System.out.println(list1.get(i)+" ");
        }System.out.println("************");
        
        //using for-each loop
        for(Object o:list1) {
        	System.out.println(o+" ");
        }System.out.println("************");
        
        //using Iterator
        Iterator itr=list1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next()+" ");
        }

	}

}
