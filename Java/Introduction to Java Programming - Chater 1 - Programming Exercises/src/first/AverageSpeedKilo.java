package first;

// 1.12

// This program will calculate average speed of a runner running 24 miles n 1 hour 40 minutes 35 seconds
// 1 Mile = 1.6 Kilometers

public class AverageSpeedKilo {

	public static void main(String[] args) {
		
		double distance = (24.0 * 1.6); // Converts miles to kilometers
		double time = (100.0 + (35.0/60.0)) / 60;
		
		// Speed = Distance / Time
		// Time = 1 hour (60 Minutes) + (40 Minutes) + 35 Seconds 
		
		double speed = distance / time;
		
		System.out.println("Running 24 Miles in 1 Hour, 40 Minutes, 35 Seconds is approx " + speed + " Kilometers Per Hour");
	
		
	}
}
