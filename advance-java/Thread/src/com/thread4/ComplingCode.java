package com.thread4;

public class ComplingCode extends Thread {
	@Override
	public void run() {
		for(;;) {
			System.out.println("Compiling Code");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
