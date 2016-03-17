package chapter2;

import java.util.Scanner;

/*
 * Chapter 2.1 (Convert Celsius to Farenheight)
 * by Clark Elliott | Last Updated: 3/16/2016
 * 
 * 
 * Exercise Instructions:
 * 
 * Read in a Celsius Degree from Console
 * Convert to Fahrenheit and Display Result
 * 
 * F = (9 / 5) * C + 32
 */

public class ConvertCtoF {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Local Variables
		double celsius, fahrenheit;
		
		// Request Celsius from Console
		System.out.print("Please Enter a Temperature in Celsius: ");
		celsius = sc.nextDouble();
				
		// Display Result
		System.out.println(celsius + " Celsius is Equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
		
		// Destroy Resources
		sc.close();
	}
	
	// Convert Celsius to Fahrenheit, Returns Fahrenheit
	private static double convertCelsiusToFahrenheit(double c) {
		return ( (9.0 / 5.0) * c + 32); // Conversion Formula
	}
	
}
