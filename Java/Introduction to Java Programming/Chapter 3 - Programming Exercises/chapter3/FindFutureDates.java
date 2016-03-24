package chapter3;

/*
 * Chapter 3.5 (Find Future Dates)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter an Integer for Today's Day of the Week
 * Sunday is 0, Monday is 1, ..., and Saturday is 6
 * Also Prompt the User to Enter the Number of Days After Today for a Future Day
 * Display the Future Day of the Week
 */

import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		String daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		// Collect Input		
		System.out.print("Enter today's day: ");		
		int today = sc.nextInt();		
		System.out.print("Enter the number of days elapsed since today: ");		
		int daysElapsed = sc.nextInt();
		
		// Process Input
		int futureDay = (daysElapsed % 7) + today;
		
		// Display Result
		System.out.println("Today is " + daysOfWeek[today] + " and the future day is " + daysOfWeek[futureDay]);
		
		// Destroy Resources
		sc.close();
		
	}
	
}