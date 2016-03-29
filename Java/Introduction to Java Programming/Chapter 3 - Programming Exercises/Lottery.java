

import java.util.Scanner;

/*
 * Chapter 3.15 (Game: Lottery)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Revise Listing 3.8 Lottery.java
 * Generate a Lottery of a Three-Digit Number
 * Prompt User to Enter a Three-Digit Number
 * Determine Whether the User Wins According to the Following Rules:
 * $10,000 for an Exact Match
 * $3,000 for Matching All 3 Digits Regardless of Order
 * $1,000 if a Single Digit Matches
 * Display Winnings!
 */

public class Lottery {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Collect Input
		System.out.print("Enter your lottery pick (three digits): ");
		int userGuess = sc.nextInt();
		
		// Generate Lottery Numbers
		int lottery = (int)(Math.random() * 900 + 100);
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10;
		int lotteryDigit3 = lottery % 10;
		
		// Get digits from Guess
		int guessDigit1 = userGuess / 100;
		int guessDigit2 = userGuess / 10;
		int guessDigit3 = userGuess % 10;
		
		System.out.println("The lottery number is " + lottery);

		// Check the guess & Display Results
		if (userGuess == lottery)
			System.out.println("Exact Match: You Win $10,000!");
		else if ((guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3)
				&& (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2))
			System.out.println("Match All Digits: You Win $3,000!");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
			System.out.println("Match Single Digit: You Win $1,000!");
		else
			System.out.println("Sorry, no Match");
		
		// Destroy Resources
		sc.close();

	}

}