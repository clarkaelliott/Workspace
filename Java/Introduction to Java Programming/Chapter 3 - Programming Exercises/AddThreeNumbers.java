/**
  * AddThreeNumbers.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 24, 2016
  * 
  *
  * Chapter 3.2 - (Game: Add Three Numbers)
  * 
  * Instructions:
  * 	Revise Listing 3.1 (AdditionQuiz.java) to
  * 	  Generate 3 Single-Digit Integers
  * 	  Prompt User to Enter the Sum
  * 
  * Notes:
  * 	
  */

import java.util.Scanner;

public class AddThreeNumbers {
	public static void main(String[] args) {
		// Generate 3 Single-Digit Integers
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int n3 = (int)(Math.random() * 10);		
		
		// Solve for the Correct Answer
		int sum = n1 + n2 + n3;
		
		// Prompt User to Enter the Sum
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("What is " + n1 + " + " + n2 + " + " + n3 + "? ");		
		int userAnswer = consoleInput.nextInt();		
		consoleInput.close();
		
		// Check for User is Correct				
		boolean isCorrect = (n1 + n2 + n3 == userAnswer);
		
		// Display Results		
		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + userAnswer + " is " + isCorrect);
	}
}