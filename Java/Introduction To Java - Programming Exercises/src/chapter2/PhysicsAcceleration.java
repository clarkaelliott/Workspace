package chapter2;

import java.util.Scanner;

// 2.9
// Physics: Acceleration

// Average Acceleration is defined as the change of velocity divided by the time taken to make the change or
// a = (v1 -v0) / t

// Prompt User to Enter Starting Velocity v0 in Meters/Second, v1 in meters/second, and time span t in Seconds
// Display the Average Acceleration

public class PhysicsAcceleration {

	public static void main(String[] args) {
		
		double v0, v1, t;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		
		v0 = sc.nextDouble();
		v1 = sc.nextDouble();
		t = sc.nextDouble();
		
		double averageAcceleration = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + averageAcceleration);
		
	}
	
}
