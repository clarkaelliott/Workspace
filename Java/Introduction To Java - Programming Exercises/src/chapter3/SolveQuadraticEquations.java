package chapter3;

// Chapter 3.1
// Algebra: Solve Quadratic Equations

// Author: Clark Elliott
// Last Updated: 3/7/2016

// Collect a, b, c from user input
// Display root values based on value of the discriminant

// *Demonstrates Operator Precedence & If Statement

import java.util.Scanner;

public class SolveQuadraticEquations {	
	
	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Collect User Input
		System.out.print("Enter a, b, c: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		// Process Input 
		double root1 = (-b + Math.sqrt(b * b - 4 * a * c) ) / (2 * a);
		double root2 = (-b - Math.sqrt(b * b - 4 * a * c) ) / (2 * a);
		double discriminant = (Math.pow(b, 2)) - (4 * a * c);
		
		// Display Results
		if (discriminant > 0)
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		else if (discriminant == 0)
			System.out.println("The equation has one root " + root1);
		else if (discriminant < 0)
			System.out.println("The equation has no real roots");
		
		// Destroy Resources
		sc.close();
		
	}
	
}