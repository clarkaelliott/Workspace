package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.26 (Use the && || and ^ Operators)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter an Integer and Determine
 * Whether it is Divisible by 5 and 6, 5 or 6, and 5 or 6 but not both.
 */


public class DivisibleBy {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		// Collect Input
		System.out.print("Enter an integer: ");
		number = sc.nextInt();
		
		// Process Input & Display Result
		System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
		System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
		System.out.println("Is " + number + " divisible by 5 and 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
		
		// Destroy Resources
		sc.close();
		
	}
}
