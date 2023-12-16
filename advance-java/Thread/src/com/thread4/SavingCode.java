package com.thread4;

public class SavingCode extends Thread {
	@Override
	public void run() {
		for(;;) {
			System.out.println("Saving Code");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
}
