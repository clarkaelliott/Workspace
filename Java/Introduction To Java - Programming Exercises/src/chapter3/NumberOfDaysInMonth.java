package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.11 (Find the Number of Days in a Month)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Prompt the User to Enter a Month and Year
 * Display the Number of Days in the Month
 * ex: 2 2012 -> February 2012 had 29 days.
 * Randomly Generate an Addition Question with Two Integers <100
 */

public class NumberOfDaysInMonth {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		String monthName[] = { "January", "February", "March", "April", "May", "June", "July",
								"August", "September", "October", "November", "December" };
		int numberOfDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		// Collect Input
		System.out.print("Enter a Month and Year: ");
		int month = sc.nextInt(), year = sc.nextInt();
		
		// Process Input
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
		
		
		// Display Results
		if (isLeapYear && month == 2)
			System.out.println(monthName[month - 1] + " " + year + " had " + (numberOfDays[month - 1] + 1) + " days");
		else
			System.out.println(monthName[month - 1] + " " + year + " had " + numberOfDays[month - 1] + " days");
		
		// Destroy Resources
		sc.close();
	}

}
