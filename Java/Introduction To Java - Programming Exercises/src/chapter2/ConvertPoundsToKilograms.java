package chapter2;

import java.util.Scanner;

/*
 * Chapter 2.4 (Convert Pounds into Kilograms)
 * by Clark Elliott | Last Updated: 3/16/2016
 * 
 * 
 * Exercise Instructions:
 * 
 * Read in a Number in Pounds
 * Convert to Kilograms
 * Display Result
 * 
 * 1 Pound = 0.454 Kilograms
 */

public class ConvertPoundsToKilograms {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Local Variables
		final double KILOGRAMS_PER_POUND = 0.454;
		double pounds, kilograms;
		
		// Request Pounds from Console
		System.out.print("Enter a number in pounds: ");
		pounds = sc.nextDouble();
						
		// Convert to Kilograms
		kilograms = pounds * KILOGRAMS_PER_POUND;
		
		// Display Results
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
		
		// Destroy Resources
		sc.close();
	
	}

}
