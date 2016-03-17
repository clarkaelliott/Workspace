package chapter2;

import java.util.Scanner;

// 2.8
// Current Time

// Listing 2.7 ShowCurrentTime.java shows current time in GMT
// Revise program to Prompt User to Enter a Time Zone
// Offset Time by Entered Time Zone

public class CurrentTime {
	
	public static void main(String[] args) {
		
		long totalMillis = System.currentTimeMillis();
		long totalSeconds = totalMillis / 1000; // Converts Millis to Seconds
		long totalMinutes = totalSeconds / 60; // Converts Seconds to Minutes
		long totalHours = totalMinutes / 24; // Converts Minutes to Hours
		
		long currentSecond = totalSeconds % 60; // Remaining Seconds on Clock
		long currentMinute = totalMinutes % 60; // Remaining Minutes on Clock
		long currentHour = totalHours % 24; // Remaining Hours
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
		
		System.out.print("\n\nEnter the time zone offset to GMT: ");
		
		Scanner sc = new Scanner(System.in);
		
		currentHour += sc.nextLong();		

		if (currentHour >= 24) {
			currentHour %= 24;
		} else if (currentHour < 0) {
			currentHour+= 24;
		}
		System.out.println("The current time is " + (currentHour) + ":" + currentMinute + ":" + currentSecond );
		
		
	}

}
