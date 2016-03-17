package chapter1;

/*
 * Chapter 1.10 (Average Speed in Miles)
 * by Clark Elliott | Last Updated: 3/15/2016
 * 
 * 
 * Instructions:
 * Display the Average Speed in MPH
 * 14 Kilometers in 45 Minutes 30 Seconds
 * 1 Mile = 1.6 Kilometers
 */

public class AverageSpeedMiles {
	
	public static void main(String[] args) {
		
		final double KILOMETERS_PER_MILE = 1.6;
		final int DISTANCE_IN_KILOMETERS = 14;
		int minutes = 45;
		int seconds = 30;
		double totalTime = (minutes * 60.0) + seconds; // Total Time in Seconds
		
		double averageSpeedInMPH = (DISTANCE_IN_KILOMETERS / KILOMETERS_PER_MILE) / (totalTime / 60.0 / 60.0);
		
		System.out.printf("%2.1f MPH", averageSpeedInMPH);
		
		
	}

}
