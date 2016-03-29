

import java.util.Scanner;

/*
 * Chapter 3.23 (Geometry: Point in a Rectangle)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Prompt User to Enter a Point (x, y)
 * Check Whether the Point is Within the Rectangle Centered at (0, 0)
 * Width = 10, Height = 5
 * Distance is <= Width/2 & <= Height/2
 */

public class PointInARectangle {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		final double WIDTH = 10.0;
		final double HEIGHT = 5.0;
		double x, y;
		
		// Collect Input
		System.out.print("Enter a point with two coordinates: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		// Test if Within Circle
		boolean insideRect = (x <= WIDTH / 2.0 && y <= HEIGHT / 2.0);
		
		// Display Result
		System.out.println("Point (" + x + ", " + y + ") is " + (insideRect ? "in the rectangle" : "not in the rectangle"));
		
		// Destroy Resources
		sc.close();
		
	}

}