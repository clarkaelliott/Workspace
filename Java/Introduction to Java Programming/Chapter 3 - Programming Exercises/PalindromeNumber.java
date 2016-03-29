

import java.util.Scanner;

/*
 * Chapter 3.12 (Palindrome Number)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter a Three-Digit Integer
 * Determine Whether it is a Palindrome Number
 * Palindrome = Same from Left to Right & Right to Left
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Collect Input
		System.out.print("Enter a three-digit integer: ");
		int number = sc.nextInt();
		
		// Process Input
		boolean isPallindrome = ((number % 10) == (number / 100));
		
		// Display Result
		System.out.println(isPallindrome ? (number + " is a palindrome") : (number + " is not a palindrome"));
		
		// Destroy Resources
		sc.close();
		
	}
}