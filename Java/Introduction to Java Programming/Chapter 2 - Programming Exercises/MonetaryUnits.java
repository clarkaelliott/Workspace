import java.util.Scanner;

// 2.22
// Financial Application: Monetary Units

// Rewrite Listing 2.10 ComputeChange.java
// Fix possible loss of Accuracy when converting a double to int

// Enter Input as int where 1156 represents 11 dollars and 56 cents

public class MonetaryUnits {
	
	public static void main(String[] args) {
		
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
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickles + " nickles");
		System.out.println("    " + numberOfPennies + " pennies");
		
	}

}
