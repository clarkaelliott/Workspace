package chapter2;

import java.util.Scanner;

// 2.16
// Geometry: Area of a Hexagon

// Prompt User to Enter the Side of a Hexagon
// Display the Hexagon's Area

// A = (3(sqrt(3))/2)s^2

public class AreaHexagon {

	public static void main(String[] args) {
		
		// Collect Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		
		double sideLength = sc.nextDouble();
		
		// Process Input
		
		double hexArea = ((3.0 * Math.sqrt(3.0) / 2.0) * Math.pow(sideLength, 2.0));
		
		// Display Output
		
		System.out.println("The area of the hexagon is " + hexArea);
	}
	
}
