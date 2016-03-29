

import java.util.Scanner;

/*
 * Chapter 3.14 (Game: Heads or Tails)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Randomly Generate an Integer 0 or 1
 * Representing Heads or Tails
 * Prompt User to Enter a Guess
 */

public class CoinFlip {

	public static void main(String[] args) {
	
		// Create Resources
		Scanner sc = new Scanner(System.in);
		int coinFlip = (int) (Math.random() * 2);
		
		// Collect & Process Input
		System.out.print("Enter 0 for Heads, 1 for Tails" + "\nGuess: ");
		boolean isCorrect = (sc.nextInt() == coinFlip);
		
		// Display Result
		System.out.println("Your guess is " + (isCorrect ? "correct" : "incorrect"));
		
	}

}