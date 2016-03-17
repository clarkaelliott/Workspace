
/**
  * AverageSpeedKilometers.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 1.12 - (Average Speed in Kilometers)
  * 
  * Instructions:
  * 	Display the Average Speed in Miles Per Hour
  * 	24 Miles in 1 Hour, 40 Minutes, and 35 Seconds
  * 
  * Notes:
  * 	1 Mile = 1.6 Kilometers
  */

public class AverageSpeedKilometers {

	public static void main(String[] args) {

		// Local Variables
		final double KILOMETERS_PER_MILE = 1.6;
		final int DISTANCE_IN_MILES = 24;
		int hours = 1, minutes = 45, seconds = 30;
		
		// Convert Time
		double totalTimeInHours = (hours) + (minutes / 60.0) + (seconds / 60.0 / 60.0);
		
		// Calculate KPH
		double averageSpeedInKPH = (DISTANCE_IN_MILES * KILOMETERS_PER_MILE) / (totalTimeInHours);
		
		// Display Result
		System.out.printf("%2.2f KPH", averageSpeedInKPH);

	}

}
