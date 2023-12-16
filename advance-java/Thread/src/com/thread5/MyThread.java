package com.thread5;

public class MyThread extends Thread {

	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("Numbers")) {
			printNumbers();
		}else {
			printCharacters();
		}
	}
	public void printNumbers() {
		System.out.println("Printing numbers Started");
		for(int i=1;i<=5;i++) {
			System.out.println("***"+i);
		}
		System.out.println("Printing numbers Completed");
	}
	public void printCharacters() {
		System.out.println("Printing Characters Started");
		for(int i=65;i<=70;i++) {
			System.out.println((char)(i));
		}
		System.out.println("Printing Characters Completed");
	}

}
