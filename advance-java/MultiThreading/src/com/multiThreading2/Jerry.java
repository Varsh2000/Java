package com.multiThreading2;


public class Jerry implements Runnable {
	Hospital h;
	public Jerry(Hospital h) {
		this.h=h;
	}
	@Override
	public void run() {
		try {
			h.treatJerry();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}