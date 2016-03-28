import java.util.Scanner;

/**
  * FindFutureDate.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 25, 2016
  * 
  *
  * Chapter 3.5 - (Find Future Dates)
  * 
  * Instructions:
  * 	Prompt User to Enter an Integer for Today's Day of the Week
  * 	Prompt User to Enter the Number of Days After Today
  * 	Display the Future Day of the Week
  * 
  * Notes:
  * 	(Sunday is 0, Monday is 1, ..., Saturday is 6)
  */

public class FindFutureDate {
	private static final String[] DAYS_OF_WEEK = { "Sunday", "Monday", "Tuesday", "Wednesday",
												"Thursday", "Friday", "Saturday" };	

	public static void main(String[] args) {
		// Create a Scanner for User Input
		Scanner consoleInput = new Scanner(System.in);
		
		// Prompt User to Enter Today's Day of the Week (0 - 6)
		System.out.print("Enter today's day: "); // TODO
		int today = consoleInput.nextInt() % 7;
		
		// Prompt User to Enter the Number of Days After Today
		System.out.print("Enter the number of days elapsed since today: "); // TODO
		int futureDays = consoleInput.nextInt();
		
		// Display the Future Day of the Week
		System.out.println("Today is " + DAYS_OF_WEEK[today] + " and the future day is " 
							+ DAYS_OF_WEEK[(today + futureDays) % 7]);		

	}

}
