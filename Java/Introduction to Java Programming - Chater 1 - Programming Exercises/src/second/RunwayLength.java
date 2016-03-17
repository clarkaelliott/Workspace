package second;

import java.util.Scanner;

// 2.12
// Physics: Finding Runway Length

// Prompt User to Enter v in Meters/Second and a Acceleration in Meters/Second Squared
// Display the Minimum Runway Length

public class RunwayLength {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		
		double speed = sc.nextDouble(); //v
		double acceleration = sc.nextDouble(); //a
		
		double minimumLength = (Math.pow(speed, 2) / (2 * acceleration));
		
		System.out.println("The minimum runway length for this airplace is " + minimumLength);
		
	}

}
