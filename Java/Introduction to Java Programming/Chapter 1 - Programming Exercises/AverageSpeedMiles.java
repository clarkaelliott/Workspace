
/**
  * AverageSpeedMiles.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 1.10 - (Average Speed in Miles)
  * 
  * Instructions:
  * 	Display the Average Speed in Miles Per Hour
  * 	14 Kilometers in 45 Minutes and 30 Seconds
  * 
  * Notes:
  * 	1 Mile = 1.6 Kilometers
  */

public class AverageSpeedMiles {

	public static void main(String[] args) {

		// Local Variables
		final double KILOMETERS_PER_MILE = 1.6;
		final int DISTANCE_IN_KILOMETERS = 14;
		int minutes = 45, seconds = 30;
		
		// Convert Time
		double totalTime = (minutes * 60.0) + seconds; // Total Time in Seconds
		
		// Calculate MPH
		double averageSpeedInMPH = (DISTANCE_IN_KILOMETERS / KILOMETERS_PER_MILE) / (totalTime / 60.0 / 60.0);
		
		System.out.printf("%2.1f MPH", averageSpeedInMPH);

	}

}
