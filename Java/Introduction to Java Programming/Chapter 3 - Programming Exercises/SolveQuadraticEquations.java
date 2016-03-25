/**
  * SolveQuadraticEquations.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 24, 2016
  * 
  *
  * Chapter 3.1 - (Algebra: Solve Quadratic Equations)
  * 
  * Instructions:
  * 	Prompt User to Enter Values for a, b, and c
  * 	Display Result based on the Discriminant
  * 
  * Notes:
  * 	ax^2 + bx + c = 0
  * 	r1 = (-b+sqrt(b^2-4ac))/2a
  * 	r2 = (-b-sqrt(b^2-4ac))/2a
  * 	discriminant = b^2 - 4ac
  * 	If Discriminant positive (2) Real Roots
  * 	If Discriminant is  zero (1) Real Roots
  * 	If Discriminant negative (0) Real Roots
  */

import java.util.Scanner;

public class SolveQuadraticEquations {
	public static void main(String[] args) {
		// Prompt User to Input Values for (a, b, and c)
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = userInput.nextDouble();
		double b = userInput.nextDouble();
		double c = userInput.nextDouble();
		userInput.close();
		
		// Solve for Roots & Discriminant 
		double root1 = (-b + Math.sqrt(b * b - 4 * a * c) ) / (2 * a);
		double root2 = (-b - Math.sqrt(b * b - 4 * a * c) ) / (2 * a);
		double discriminant = (Math.pow(b, 2)) - (4 * a * c);
		
		// Display Results based on Discriminant
		if (discriminant > 0)
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		else if (discriminant == 0)
			System.out.println("The equation has one root " + root1);
		else if (discriminant < 0)
			System.out.println("The equation has no real roots");		
	}
}