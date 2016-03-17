package chapter4;

import java.util.Scanner;

/*
 * Chapter 4.2 (Geometry: Great Circle Distance)
 * by Clark Elliott | Last Updated: 3/14/2016
 * 
 * 
 * Instructions:
 * The Great Circle Distance is the Distance Between Two Points on the Surface of a Sphere
 * Let (x1, y1) and (x2, y2) be the Geographical Latitude and Longitude of Two Points
 * Distance = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2) )
 * 
 * Prompt User to Enter the Latitude and Longitude of Two Points on Earth in Degrees
 * Display the Great Circle Distance
 * Earth Radius = 6371.01 km
 * 
 */

public class GreatCircleDistance {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		final double EARTH_RADIUS = 6371.01; // Measured in Kilometers
		
		// Prompt User for Coordinates & Convert to Radians
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = Math.toRadians(sc.nextDouble());
		double y1 = Math.toRadians(sc.nextDouble());
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = Math.toRadians(sc.nextDouble());
		double y2 = Math.toRadians(sc.nextDouble());
		
		// Calculate Distance
		double greatCircleDistance = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2) );		
		
		
		// Displat Results
		System.out.println("The distance between the two points is " + greatCircleDistance + " km");
		
		
		// Destroy Resources
		sc.close();

	}

}
