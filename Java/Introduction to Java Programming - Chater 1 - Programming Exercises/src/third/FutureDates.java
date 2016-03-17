package third;

import java.util.Scanner;

// 3.5
// Find Future Dates

// I did this in a quick hurry and I must say that honestly I believe I wrote this
// program in the worst possible way and anyone who knows anything about oop would laugh me out of the place
// after reading this program, I should really come back and re-write this proper TODO

public class FutureDates {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		
		int today = sc.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		
		int elapsed = sc.nextInt();
		
		String dayOfWeek = null;
		String futureDay = null;
		
		switch (today) {
		case 0: dayOfWeek = "Sunday";
		break;
		case 1: dayOfWeek = "Monday";
		break;
		case 2: dayOfWeek = "Tuesday";
		break;
		case 3: dayOfWeek = "Wednesday";
		break;
		case 4: dayOfWeek = "Thursday";
		break;
		case 5: dayOfWeek = "Friday";
		break;
		case 6: dayOfWeek = "Saturday";
		break;
		}
		
		elapsed %= 7;
		
		switch (elapsed + today) {
		case 0: futureDay = "Sunday";
		break;
		case 1: futureDay = "Monday";
		break;
		case 2: futureDay = "Tuesday";
		break;
		case 3: futureDay = "Wednesday";
		break;
		case 4: futureDay = "Thursday";
		break;
		case 5: futureDay = "Friday";
		break;
		case 6: futureDay = "Saturday";
		break;
		}
		
		System.out.println("Today is " + dayOfWeek + " and the future day is " + futureDay);
		
	}

}
