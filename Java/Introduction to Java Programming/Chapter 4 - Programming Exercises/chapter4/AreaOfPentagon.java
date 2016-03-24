package chapter4;

import java.util.Scanner;

/*
 * Chapter 4.1 (Geometry: Area of a Pentagon)
 * by Clark Elliott | Last Updated: 3/14/2016
 * 
 * 
 * Instructions:
 * Prompt the User to Enter the Length from the Center of a Pentagon to a Vertex
 * Compute the Area of the Pentagon
 * Area = (5 * s^2) / (4 * tan(pi / 5) )
 * s = 2r(sin(pi / 5) )
 * r = Length from Center to Vertex
 * 
 * Note: Round Up Two Digits After Decimal Point
 */

public class AreaOfPentagon {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);

		// Prompt User for Length From Center
		
		
		System.out.print("Enter the length from the center to a vertex: ");
		
		// Compute Area
		double r = sc.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(s, 2) ) / ( 4 * Math.tan(Math.PI / 5) );
		
		// Format Area to ##.##
		area *= 100;
		area = Math.round(area) / 100.0;
		
		// Display Results
		System.out.println("The area of the pentagon is " + area);
		
		
		// Destroy Resources
		sc.close();

	}

}
