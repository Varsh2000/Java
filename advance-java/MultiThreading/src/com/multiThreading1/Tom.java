package com.multiThreading1;

public class Tom implements Runnable {
	Hospital h;
	public Tom(Hospital h) {
		this.h=h;
	}
	@Override
	public void run() {
			try {
				h.treatTom();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	

}
