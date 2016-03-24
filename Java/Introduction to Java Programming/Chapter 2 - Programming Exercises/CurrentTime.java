import java.util.Scanner;

/**
 * CurrentTime.java
 *  
 * Author: Clark Elliott  |  Last Updated: Mar 24, 2016
 * 
 *
 * Chapter 2.8 - (Current Time)
 * 
 * Instructions:
 * 		Revise Listing 2.7 (ShowCurrentTime.java) to
 * 		Prompt the User to Enter the Time Zone Offset to GMT
 * 		Display the Time in the Specified Time Zone
 *
 * Notes:
 * 	
 */

public class CurrentTime {
	public static void main(String[] args) {
		// Create Scanner for User Input
		Scanner userInput = new Scanner(System.in);
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Prompt User for Offset
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = userInput.nextInt();
		
		// Adjust Time
		if (currentHour + offset < 0)
			currentHour += 24 + offset;
		else if (currentHour + offset > 23)
			currentHour -= 24 - offset;
		else
			currentHour += offset;
		
		// Display results
		System.out.println("Current time is " + currentHour + ":"
			+ currentMinute + ":" + currentSecond + " GMT");
	
		// Close Scanner
		userInput.close();
	}
	
}
