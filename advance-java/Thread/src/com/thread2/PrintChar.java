package com.thread2;

public class PrintChar implements Runnable{
	@Override
	public void run() {
		for(int i=65;i<=74;i++) {
			System.out.println((char)(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
