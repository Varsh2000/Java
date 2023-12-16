package com.thread3;

public class Reel extends Thread {
	public void run() {			
		try {
			System.out.println("Creating Reels");
			Thread.sleep(2000);
			System.out.println("Uploading Reels");
			Thread.sleep(2000);
			System.out.println("Sharing Reels");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
