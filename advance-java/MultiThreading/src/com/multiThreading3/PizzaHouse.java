package com.multiThreading3;

public class PizzaHouse {
	int token;
	boolean isAvailable=false;
	public void bake(int num) {
		if(isAvailable==false) {
			token=num;
			System.out.println("Baker is baking for "+token);
			isAvailable=true;
			notify();			
		}else {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void eat() {
		if(isAvailable==true) {
			System.out.println("Customer is eating pizza for "+token);
			isAvailable=false;
			notify();			
		}else {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}


}
