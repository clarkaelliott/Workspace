package chapter3;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter height in feet: ");
		double feetTall = sc.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double inchesTall = sc.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = ((feetTall * 12) + inchesTall) * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
		
		
	}

}
