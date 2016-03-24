import java.util.Scanner;

/**
  * CalculateTips.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 23, 2016
  * 
  *
  * Chapter 2.5 - (Financial Application: Calculate Tips)
  * 
  * Instructions:
  * 	Read in the Subtotal and Gratuity Rate
  * 	Compute the Gratuity and Total
  * 	Display Results
  * 	
  * Notes:
  * 	
  */

public class CalculateTips {
	// Returns Gratuity Amount
	public static double computeGratuity(double subTotal, double gratuityRate) {
		return subTotal * gratuityRate;
	}	
	
	public static void main(String[] args) {
		// Create Scanner for User Input
		Scanner userInput = new Scanner(System.in);
		
		// Prompt User to Input a Subtotal & Gratuity Rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subTotal = userInput.nextDouble();
		double gratuityRate = userInput.nextDouble() / 100.0;
		
		// Compute the Gratuity & Total
		double gratuity = computeGratuity(subTotal, gratuityRate);
		double total = subTotal + gratuity;
		
		// Display Results
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	
		// Close Scanner & Exit
		userInput.close();
		System.exit(0);
	}

}
