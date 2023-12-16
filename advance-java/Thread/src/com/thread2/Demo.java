package com.thread2;

import com.thread.PrintChar;
import com.thread.PrintNum;

public class Demo {

	public static void main(String[] args) {
		PrintNum pn=new PrintNum();		
		PrintChar pc=new PrintChar();
		
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pc);
		
		t1.start();
		t2.start();

	}

}
