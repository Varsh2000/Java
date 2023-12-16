package com.collection1;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("Elements = "+list1);
        int i1=list1.get(0);
        int i2=list1.get(1);
        int i3=list1.get(2);
        System.out.println("i1="+i1);
        System.out.println("i2="+i2);
        System.out.println("i3="+i3);

	}

}
