import java.util.Scanner;

/**
  * ConvertPoundsToKilograms.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 21, 2016
  * 
  *
  * Chapter 2.4 - (Convert Pounds into Kilograms)
  * 
  * Instructions:
  * 	Read in a # of Pounds from Console
  * 	Convert Input to Kilograms
  * 	Display Results
  * 
  * Notes:
  * 	1 Pound = 0.454 Kilograms
  */

public class ConvertPoundsToKilograms {
	private static final double RATIO = 0.454; // Conversion Ratio
	
	// Return Pounds from Kilograms
	public static double poundsToKilograms(double pounds) {
		return pounds * RATIO;
	}
	
	public static void main(String[] args) {
		// Create Scanner for Console Input
		Scanner userInput = new Scanner(System.in);
		
		// Prompt User to Enter a Value of Pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = userInput.nextDouble();
		
		// Convert Input to Pounds
		double kilograms = poundsToKilograms(pounds);
		
		// Display Results to Console
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");		
	}

}
