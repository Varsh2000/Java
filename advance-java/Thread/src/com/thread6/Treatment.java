package com.thread6;

public class Treatment extends Thread {
	@Override
	synchronized public void run() {
		try {
			System.out.println("Treatment Started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment in Progress for " +Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment Completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
