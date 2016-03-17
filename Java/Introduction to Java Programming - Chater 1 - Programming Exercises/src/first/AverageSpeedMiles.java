package first;

// This program will calculate the average speed a runner runs from kilometers to miles

public class AverageSpeedMiles {

	public static void main(String[] args) {
		
		// 1 Mile = 1.6 Kilometer
		
		int distanceKilo = 14;
		double runTime = 45.5;
		
		double speed = (distanceKilo / 1.6) / (runTime / 60);
		
		System.out.println(speed);
		
	}
}
