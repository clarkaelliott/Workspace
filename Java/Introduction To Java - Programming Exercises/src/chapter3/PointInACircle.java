package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.22 (Geometry: Point in a Circle)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter a Point (x, y)
 * Check Whether the Point is Within the Circle Centered at (0, 0) with Radius = 10
 * Distance to (0, 0) <= Radius
 * distance = sqrt((x2-x1)^2 + (y2-y1)^2)
 */

public class PointInACircle {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		final double RADIUS = 10.0;
		double x, y;
		
		// Collect Input
		System.out.print("Enter a point with two coordinates: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		// Test if Within Circle
		boolean insideCircle = (Math.sqrt(Math.pow(0.0 - x, 2) + Math.pow(0.0 - y, 2) ) <= RADIUS);
		
		// Display Result
		System.out.println("Point (" + x + ", " + y + ") is " + (insideCircle ? "in the circle" : "not in the circle"));
		
		// Destroy Resources
		sc.close();
		
	}

}