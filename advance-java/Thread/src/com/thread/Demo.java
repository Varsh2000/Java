package com.thread;
public class Demo {

	public static void main(String[] args) {
		PrintNum pn=new PrintNum();
		pn.start();
		PrintChar pc=new PrintChar();
		pc.start();
	}

}
