package chapter2;

import java.util.Scanner;

/*
 * Chapter 2.3 (Convert Feet Into Meters)
 * by Clark Elliott | Last Updated: 3/16/2016
 * 
 * 
 * Exercise Instructions:
 * 
 * Read in a Number in Feet
 * Convert It to Meters
 * Display Result
 * 
 * 1 Foot = 0.305 Meter
 */

public class ConvertFeetToMeters {

	public static void main(String[] args) {
	
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Local Variables
		final double METERS_PER_FOOT = 0.305;
		double feet, meter;
		
		
		// Request Feet from Console
		System.out.print("Enter a value for feet: ");
		feet = sc.nextDouble();
						
		// Convert to Meter
		meter = feet * METERS_PER_FOOT;
		
		// Display Results
		System.out.println(feet + " feet is " + meter + " meters");
		
		// Destroy Resources
		sc.close();
	
	}
	
}
