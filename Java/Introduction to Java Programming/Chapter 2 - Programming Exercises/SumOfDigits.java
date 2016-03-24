import java.util.Scanner;

/**
  * SumOfDigits.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 23, 2016
  * 
  *
  * Chapter 2.6 - (Sum the Digits in an Integer)
  * 
  * Instructions:
  * 	Read in an Integer Between 0 and 1000
  * 	Add All the Digits in the Integer
  * 	Display Sum of Digits
  * 
  * Notes:
  * 	Example: 932 = 9+3+2 = 14
  */

public class SumOfDigits {
	// Returns Sum of All Digits
	public static int getSum(int num) {
		int sum = 0; // Total to Return
		int number = num; // Number to Work With
		
		// Extract the Value of Each Digit & Add to Sum
		for (int i = 0; i < 4; i++) {
			sum += number % 10;
			number /= 10;
		}
		
		return sum;
	}

	// Reads in Int between 0 & 1000, displays sum of the digits
	public static void main(String[] args) {
		int usersNumber = 0, sum = 0;
		
		// Create Scanner for User Input
		Scanner userInput = new Scanner(System.in);		
		
		// Prompt User to Input an Integer > 0 < 1000
		System.out.println("Enter a number between 0 and 1000: ");
		usersNumber = userInput.nextInt();
		if (usersNumber > 999 || usersNumber < 1) {
			System.out.println("Sorry, next time follow the rules.");
			System.exit(1);
		}			
		else
			sum = getSum(usersNumber); // Calculate Sum		
		
		// Display Results
		System.out.println("The sum of the digits is " + sum);
	}

}
