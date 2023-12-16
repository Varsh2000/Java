package com.thread4;

public class TypingCode extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Typing Code");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
