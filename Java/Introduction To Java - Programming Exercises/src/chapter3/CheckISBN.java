package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.9 (Business: Check ISBN-10)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter the First 9 Digits
 * Display the 10-Digit ISBN (Including Leading Zeros)
 * Read Input as an Integer
 */

public class CheckISBN {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		int checksum = 0; // (d1 * 1 + d2 * 2 + ... d9 * 9) % 11
		int ISBNNumber[] = new int[9];
		int ISBNNumberTemp = 0;
				
		// Collect Input
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		ISBNNumberTemp = sc.nextInt();
		for (int i = 8; i >= 0; i--) {
			ISBNNumber[i] = ISBNNumberTemp % 10;
			ISBNNumberTemp /= 10;			
		}
		
		// Process Input
		for (int i = 1; i < 10; i++) {
			checksum += (ISBNNumber[i - 1] * i);
		} checksum %= 11;
		
		// Display Results
		System.out.print("The ISBN-10 number is ");
		for (int i = 0; i < 9; i++)
			System.out.print(ISBNNumber[i]);
		if (checksum == 10)
			System.out.print("X");
		else
			System.out.print(checksum);
		
		// Destroy Resources
		sc.close();

	}

}