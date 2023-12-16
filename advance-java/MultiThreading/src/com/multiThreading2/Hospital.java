package com.multiThreading2;

public class Hospital {

	String res1="Doctor";
	String res2="Bed";
	public void treatTom() throws InterruptedException {
		synchronized (res1) {
			System.out.println("Tom is using "+res1);
			Thread.sleep(2000);
			synchronized (res2) {
				System.out.println("Tom is using "+res2);
				Thread.sleep(2000);
			}
		}		
	}
	public void treatJerry()throws InterruptedException {
		synchronized (res2) {
			System.out.println("Jerry is using "+res2);
			Thread.sleep(2000);
			synchronized (res1) {
				System.out.println("Jerry is using "+res1);
				Thread.sleep(2000);
			}
		}		
		
	}
}