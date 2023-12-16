package com.encapsule;

public class DogApp {

	public static void main(String[] args) {
		Dog d=new Dog("Pinky","Pink",2,"BullDog");
		System.out.println(d.getName()+" "+d.getColor()+" "+
		d.getAge()+" "+d.getBreed());

	}

}
