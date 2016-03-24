package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.8 (Sort Three Integers)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter Three Integers
 * Display the Integers in Non-Decreasing Order (Ascending?)
 */

public class SortThreeIntegers {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[3];
		
		// Collect Input
		System.out.print("Enter 3 Integers in Any Order: ");
		for (int i = 0; i < 3; i++)
			numbers[i] = sc.nextInt();
						
		// Process Input (My Very First Attempt at Sorting)
		for (int i = 0; i < 3; i++)
			for (int j = i + 1; j < 3; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		
		
		// Display Result
		for (int i = 0; i < 3; i++)
			System.out.print(numbers[i] + " ");
		
		// Destroy Resources
		sc.close();

	}

}