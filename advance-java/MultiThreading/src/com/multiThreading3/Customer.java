package com.multiThreading3;

public class Customer implements Runnable {

	PizzaHouse ph;
	public Customer(PizzaHouse ph) {
		this.ph=ph;
	}
	
	@Override
	public void run() {
	while(true){
		ph.eat();
	}
}
}
