package com.exception;

import java.util.Scanner;

public class GenerateDrivingLicence {

	public static void main(String[] args) {
		System.out.println("Driving Licence Application started...");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			checkAge(age);				
		}
		catch(UnderAgeException e){
			e.printStackTrace();
		}
		catch(OverAgeException e){
			e.printStackTrace();
		}
	}

	private static void checkAge(int age) throws UnderAgeException, OverAgeException {
		System.out.println("Driving Lience Generation started...");
		if(age>=18 && age<=65) {
			System.out.println("Yes, you are eligible for Driving Licence.");
		}
		else if(age<18) {
			System.out.println("Baby, you are too young to apply for Driving Licence");
			throw new UnderAgeException("Person is under 18");
		}
		else {
			System.out.println("Daada, you are too old to apply for Driving Licence");
			throw new OverAgeException("Person is over 65");
		}

	}
}


