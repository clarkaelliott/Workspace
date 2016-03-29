

import java.util.Scanner;

// 3.7
// Financial Application: Monetary Units

public class MonetaryUnits {
	
	public static void main(String[] args) {
		
		// Modify 2.10 ComputeChange.java to display nonzero denominations only using singular words for single units dollar(s) penny(ies) etc...
		// and of course plural words for plural duh
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an amount of money as an int, for example $11.56 would be 1156: ");
		
		int amount = sc.nextInt();
		
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
		
		System.out.println("Your amount $" + (amount / 100.0) + " consists of");
		
		if (numberOfOneDollars > 1)
			System.out.println("    " + numberOfOneDollars + " dollars");
		else if (numberOfOneDollars == 1)
			System.out.println("    " + numberOfOneDollars + " dollar");
		// TODO repeat for all denominations ez peazy pumkin breezy sleezy
		
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickles + " nickles");
		System.out.println("    " + numberOfPennies + " pennies");
		
	}

}
