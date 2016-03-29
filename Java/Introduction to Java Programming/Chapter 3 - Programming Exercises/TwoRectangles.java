

import java.util.Scanner;

/*
 * Chapter 3.28 (Geometry: Two Rectangles)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Prompt the User to Enter the Center (x, y) Coordinates, Width, and Height of 2 Rectangles
 * Determine Whether the Second Rectangle is Inside the First or Overlaps the First
 * 
 */

public class TwoRectangles {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, width1, height1, width2, height2;
		
		// Collect Input
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		width1 = sc.nextDouble();
		height1 = sc.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		width2 = sc.nextDouble();
		height2 = sc.nextDouble();
		
		// Check For Inside One Another (a)
		boolean isInside = ( (x1 + width) // TODO Stopped Here
		
		// Check For Overlap (b)
		
				
		// Display Result
		
		
		// Destroy Resources
		sc.close();
		
	}

}