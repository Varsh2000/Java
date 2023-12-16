package com.thread3;

public class Chat extends Thread {
	public void run() {			
			try {
				System.out.println("Chatting Started");
				Thread.sleep(2000);
				System.out.println("Chit Chat Chit Chat");
				Thread.sleep(2000);
				System.out.println("Chatting Ended");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
