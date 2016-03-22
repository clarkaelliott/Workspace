import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
  * VolumeOfCylinder.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 21, 2016
  * 
  *
  * Chapter 2.2 - (Compute the Volume of a Cylinder)
  * 
  * Instructions:
  * 	Read in the Radius and Length of a Cylinder
  * 	Compute the Area and Volume
  * 
  * Notes:
  * 	Area = Radius * Radius * Pi
  * 	Volume = Area * Length
  */


public class VolumeOfCylinder {
	
	// Computes the Area of a Cylinder
	public static double getArea(double radius) {
		return radius * radius * Math.PI;
	}
	
	// Computes the Volume of a Cylinder
	public static double getVolume(double area, double length) {
		return area * length;
	}
	
	// Computes Area & Volume of a Cylinder based upon User Input
	public static void main(String[] args) {
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Units of Measurement for Cylinder
		double area, volume, radius, length;
		
		// Prompt User to Enter a Radius & Length from Console
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = sc.nextDouble();
		length = sc.nextDouble();
		
		// Compute Area & Volume Using Input Given
		area = getArea(radius);
		volume = getVolume(area, length);
		
		// Formatting to Match Book
		DecimalFormat toMatchBooksExample = new DecimalFormat("#.####");
		toMatchBooksExample.setRoundingMode(RoundingMode.FLOOR);
		
		// Display Results to Console
		System.out.println("The area is " + toMatchBooksExample.format(area)); 
		System.out.printf("The volume is %.1f", volume); // Matches Book Formatting
		
		// Destroy Resources
		sc.close();
	}
	
}
