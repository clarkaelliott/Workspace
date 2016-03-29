

import java.util.Scanner;

/*
 * Chapter 3.27 (Geometry: Points in Triangle?)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Suppose a Right Triangle is Placed in a Plane at (0, 0)
 * The Other 2 Points are Placed at (200, 0) and (0, 100)
 * Prompt the User to Enter a Point (x, y)
 * Determine Whether the Point is Inside the Triangle or Not
 */

public class PointsInTriangle {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		// Collect Input
		System.out.print("Enter a point's x- and y-coordinates: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		// Check if Point is Inside Triangle
		boolean insideTriangle = (x >= 0 && x <= 200 && y >= 0 && y <= 100); // Place Holder
		// TODO Learn Math for Hypotenuse Calculation
		
		// Display Result
		System.out.println("The point is " + (insideTriangle ? "in " : "not in ") + "the triangle");
		
		// Destroy Resources
		sc.close();
		
	}
	
}