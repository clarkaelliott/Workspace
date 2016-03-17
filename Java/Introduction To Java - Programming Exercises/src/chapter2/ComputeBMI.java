package chapter2;

import java.util.Scanner;

// 2.14
// Health Application: Computing BMI

// Body Mass Index (BMI) = Weight (kilograms) / Height^2 (meters)

// Prompt User to Enter a Weight in Pounds and Height in Inches
// Conversions -
// 1 Pound = 0.45359237 Kilograms
// 1 Inch = 0.0254 Meters

public class ComputeBMI {
	
	public static void main(String[] args) {
		
		// Collect Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		
		double weightLbs = sc.nextDouble();
		
		System.out.print("Enter height in inches: ");
		
		double heightInches = sc.nextDouble();
		
		// Convert Variables
		
		double weightKilo = weightLbs * 0.45359237;
		double heightMeters = heightInches * 0.0254;
		
		// Display Results
		
		double bodyMassIndex = weightKilo / Math.pow(heightMeters, 2);
		
		System.out.println("BMI is " + (int)(bodyMassIndex * 1000) / 1000.0);
		
		
	}

}
