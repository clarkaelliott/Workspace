package chapter2;

import java.util.Scanner;

/*
 * Chapter 2.2 (Compute the Volume of a Cylinder)
 * by Clark Elliott | Last Updated: 3/16/2016
 * 
 * 
 * Exercise Instructions:
 * 
 * Read in the Radius & Length of a Cylinder
 * Compute the Area & Volume Using:
 * 
 * Area = Radius * Radius * PI
 * Volume = Area * Length
 */

public class CylinderVolume {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Local Variables
		double radius, length, area, volume;
		
		// Request Radius & Length from Console
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = sc.nextDouble();
		length = sc.nextDouble();
				
		// Calculate Area & Volume
		area = radius * radius * Math.PI;
		volume = area * length;
		
		// Display Results
		System.out.println("\nThe area is " + area + "\nThe volume is " + volume);
		
		// Destroy Resources
		sc.close();
		
	}
	
}
