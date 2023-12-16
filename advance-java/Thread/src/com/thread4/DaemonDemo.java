package com.thread4;

public class DaemonDemo {
	public static void main(String[] args) {
		TypingCode t1=new TypingCode();		
		ComplingCode t2=new ComplingCode();
		SavingCode t3=new SavingCode();
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
