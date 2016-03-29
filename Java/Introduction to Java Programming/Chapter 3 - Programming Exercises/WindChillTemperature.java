

import java.util.Scanner;

/*
 * Chapter 3.20 (Science: Wind-Chill Temperature)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Revise PE 2.17 to Display whether input is valid
 * Temperature must be between -58 and 41F
 * Wind Speed must be >= 2
 */

public class WindChillTemperature {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Collect Input
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double tempOutside = sc.nextDouble();
		if (tempOutside < -58 || tempOutside > 41) {
			System.out.println("Invalid Temperature");
			System.exit(0);
		}
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = sc.nextDouble();
		if (windSpeed < 2) {
			System.out.println("Invalid Wind Speed");
			System.exit(0);
		}
		// Process Input
		double windChill = (35.74 + (0.6215 * tempOutside) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * (tempOutside * Math.pow(windSpeed, 0.16))));		
				
		// Display Result
		System.out.println("The wind chill index is " + windChill);
		
		
	}
	
}