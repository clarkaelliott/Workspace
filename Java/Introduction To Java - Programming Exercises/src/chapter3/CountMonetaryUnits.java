package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.7 (Financial Application: Monetary Units)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Modify Listing 2.1 ComputeChange.java to Display Only NonZero Denominations
 * Use Singular Words for Single Units(Dollar, Penny, etc)
 * Use Plural Words for Multiple Units(Dollars, Nickles, Dimes, etc)
 */

public class CountMonetaryUnits {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Collect Input		
		System.out.print("Enter an amount of money as an int, for example $11.56 would be 1156: ");		
		int amount = sc.nextInt();
		
		// Process Input		
		int remainingAmount = amount;		
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		int numberOfNickles = remainingAmount / 5;
		remainingAmount %= 5;
		
		int numberOfPennies = remainingAmount;
		
		// Display Result		
		System.out.println("Your amount $" + (amount / 100.0) + " consists of");
		System.out.println((numberOfOneDollars) + (numberOfOneDollars > 1 ? " dollars" : " dollar"));
		System.out.println((numberOfQuarters) + (numberOfQuarters > 1 ? " quarters" : " quarter"));
		System.out.println((numberOfDimes) + (numberOfDimes > 1 ? " dimes" : " dime"));
		System.out.println((numberOfNickles) + (numberOfNickles > 1 ? " nickles" : " nickle"));
		System.out.println((numberOfPennies) + (numberOfPennies > 1 ? " pennies" : " penny"));
		
		// Destroy Resources
		sc.close();
		
	}

}