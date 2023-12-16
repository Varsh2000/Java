package com.marathon;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator(); 

		double dis=journeyCalculator.calculateDistance(60.0, 1.5); 
		System.out.printf("%.2f",dis);

	}

}
