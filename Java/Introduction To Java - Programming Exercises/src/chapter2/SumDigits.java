package chapter2;

import java.util.Scanner;

// 2.6
// Sum the Digits in an Integer

// Read in Integer between 0 & 1000
// Add All Digits in the Integer
// Example: 932 = 14 or 932 = 9 + 3 + 2 = 14

public class SumDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		
		int userInput = sc.nextInt();
		
		if (userInput >= 0 && userInput <= 1000) {			
			
			int digitTotal = 0;
			
			for (int i = 0; i < 4; i++) {
				
				digitTotal += (userInput % 10);
				userInput /= 10;
				
			}
			
			System.out.println("The sum of the digits is " + digitTotal);
		} else {
			System.out.println("Follow the rules next time. ");
		}
		
	}
}
