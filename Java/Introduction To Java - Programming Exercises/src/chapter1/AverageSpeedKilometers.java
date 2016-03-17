package chapter1;

/*
 * Chapter 1.12 (Average Speed in Kilometers)
 * by Clark Elliott | Last Updated: 3/15/2016
 * 
 * 
 * Instructions:
 * Display the Average Speed in KPH
 * 24 Miles in 1 hour 40 Minutes 35 Seconds
 * 1 Mile = 1.6 Kilometers
 */

public class AverageSpeedKilometers {
	
	public static void main(String[] args) {
		
		final double KILOMETERS_PER_MILE = 1.6;
		final int DISTANCE_IN_MILES = 24;
		int hours = 1, minutes = 45, seconds = 30;
		double totalTimeInHours = (hours) + (minutes / 60.0) + (seconds / 60.0 / 60.0);
		
		double averageSpeedInKPH = (DISTANCE_IN_MILES * KILOMETERS_PER_MILE) / (totalTimeInHours);
		
		System.out.printf("%2.2f KPH", averageSpeedInKPH);		
		
	}

}
