

import java.util.Scanner;

/*
 * Chapter 3.16 (Random Point)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Display a Random Coordinate in a Rectangle
 * The Rectangle is Centered at (0, 0) with Width 100 and Height 200
 */

public class RandomPoint {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Generate Random Coordinate
		int x = (int)(Math.random() * 102 - 51); // Width Point
		int y = (int)(Math.random() * 202 - 101); // Height Point
		
		// Display Result
		System.out.println("Random Point: (" + x + "," + y + ")");
		
		// Destroy Resources
		sc.close();

	}

}