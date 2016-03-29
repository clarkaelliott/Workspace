

import java.util.Scanner;

/*
 * Chapter 3.19 (Compute the Perimeter of a Triangle)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Read Three Edges for a Triangle
 * Compute the Perimete if Input is Valid
 * Otherwise Display Input is Invalid
 * Input is Valid if the Sum of Every Pair of Two Edges is > the Remaining Edge
 * P = a + b + c
 */

public class TrianglePerimeter {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		double perimeter = 0.0;
		
		// Collect Input
		System.out.print("Enter 3 Edges of a Triangle: ");
		double edge1 = sc.nextDouble();
		double edge2 = sc.nextDouble();
		double edge3 = sc.nextDouble();
		
		// Process Input, Check if Valid
		boolean isValid = ( ( edge1 + edge2 > edge3 ) && ( edge1 + edge3 > edge2 ) && ( edge2 + edge3 > edge1 ) );
		if (isValid)
			perimeter = ( edge1 + edge2 + edge3 );
		else
			System.out.println("Invalid input");
		
		// Display Result
		if (isValid)
			System.out.println("Perimeter = " + perimeter);
	
	}
	
}