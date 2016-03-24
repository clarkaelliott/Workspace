package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.10 (Game: Addition Quiz)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Revise Listing 3.3 SubtractionQuiz.java to
 * Randomly Generate an Addition Question with Two Integers <100
 */

public class AdditionQuiz {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// Collect Input
		System.out.print("What is " + number1 + " + " + number2);
		int answer = sc.nextInt();
					
		// Display Result
		if (number1 + number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
		
		
		// Destroy Resources
		sc.close();

	}

}