

import java.util.Scanner;

/*
 * Chapter 3.21 (Science: Day of the Week)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter a Year, Month, and Day of the Month
 * Display the Correct Day of the Week for Input Given
 * 
 * h = (q + (26(m+1)/10) + k + k/4 + j/4 + 5j) % 7
 * where h = day of the week (0:sat, 1:sun, ..., 6:fri)
 * q = day of the month (1-31?)
 * m = month (1jan, 2feb, ..., 12dec
 * j = century ( year/100 )
 * k = year of century ( year % 100 )
 */

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		int dayOfMonth, month, year, century;
		String days[] = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		//String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		// Collect Input
		System.out.print("Enter year: ");
		year = sc.nextInt();
		System.out.print("Enter month: ");
		month = sc.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		dayOfMonth = sc.nextInt();
		
		// Process Input
		if (month == 1) {
			month = 13;
			year--;
		}
		if (month == 2) {
			month = 14;
			year--;
		}
		century = year / 100;
		int dayOfWeek = ( ( dayOfMonth + ( ( 26 * month + 26 ) / 10 ) + (year % 100 ) + ( ( year % 100 ) / 4 ) + ( century / 4 ) + ( 5 * century ) ) % 7 );
		
		// Display Result
		System.out.println("Day of the week is " + days[dayOfWeek]);
		
		// Destroy Resources
		sc.close();
	}

}