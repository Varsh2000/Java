package com.thread3;

public class InstagramApp {
	public static void main(String[] args) {
		Chat c=new Chat();
		Reel r=new Reel();
		c.start();
		r.start();
		System.out.println("Instagram Application Started");
		try {
			c.join();
			r.join();			
		}catch(InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Instagram Application has been Terminated");
	}
}
