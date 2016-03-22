import java.util.Scanner;

/**
  * ConvertFeetToMeter.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 21, 2016
  * 
  *
  * Chapter 2.3 - (Convert Feet into Meters)
  * 
  * Instructions:
  * 	Read in a Number in Feet
  * 	Convert to Meters and Display Results
  * 
  * Notes:
  * 	1 Foot = 0.305 Meters
  */

public class ConvertFeetToMeter {
	private static final double RATIO = 0.305; // Conversion Ratio
	
	// Returns Converted Feet from Meters
	public static double convertToMeters(double feet) {
		return feet * RATIO;
	}
	
	// Convert Feet Given by User to Meters & Displays the Results
	public static void main(String[] args) {
		// Create a Scanner for Console Input
		Scanner userInput = new Scanner(System.in);
		
		// Prompt User for Input of Feet
		System.out.print("Enter a value for feet: ");
		double feet = userInput.nextDouble();
		
		// Convert Input to Meters
		double meters = convertToMeters(feet);
		
		// Display Results
		System.out.println(feet + " feet is " + meters + " meters");
		
		// Close Scanner
		userInput.close();

	}

}
