import java.util.Scanner;

/**
  * AverageOfUnsignedNumbers.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 28, 2016
  * 
  *
  * Chapter 5.1 - (Count Positive and Negative Numbers and Compute the Average of Numbers)
  * 
  * Instructions:
  * 	Read in an Unspecified Number of Integers
  * 	Determine how many are Positive, and how may are Negative
  * 	Compute the Total & Average of the Values (Not Including Zeroes)
  * 
  * Notes:
  * 	Input '0' Ends the Program
  * 	Display the Average as a Floating-Point Number
  */

public class AverageOfUnsignedNumbers {
	
	public static void main(String[] args) {
		// Create a Scanner for User Input
		Scanner consoleInput = new Scanner(System.in);
		
		// Prompt User to Enter Numbers
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		// Variables for Computation
		int negativeCount = 0;
		int positiveCount = 0;
		int sum = 0;
		float average = 0.0f;
		int temp = consoleInput.nextInt();
		
		// Compute Total & Average
		do {
			// Check for Initial 0 & Exit
			if (temp == 0 && sum == 0) {
				System.out.println("No numbers are entered except 0");
				System.exit(0);
			}
			else if (temp > 0)
				positiveCount++;
			else if (temp < 0)
				negativeCount++;
			
			// Add Total & Obtain Next Number from Console
			sum += temp;
			temp = consoleInput.nextInt();
		}
		while (temp != 0);
		
		// Compute Average
		average = ((float)sum / (negativeCount + positiveCount));
		
		// Display Results	
		System.out.println("The number of positives is " + positiveCount);
		System.out.println("The number of negatives is " + negativeCount);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
		
	}

}
