/**
  * SolveLinearEquations.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 24, 2016
  * 
  *
  * Chapter 3.3 - (Algebra: Solve 2 X 2 Linear Equations)
  * 
  * Instructions:
  * 	Prompt User to Enter (a, b, c, d, e, and f)
  * 	Display the Result
  * 	  If (ad - bc) is 0, report that "The equation has no solution."
  * 
  * Notes:
  * 	Refer to Programming Exercise 1.13
  */

import java.util.Scanner;

public class SolveLinearEquations2 {
	public static void main(String[] args) {		
		// Prompt User to Enter Values for (a, b, c, d, e, and f)
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = consoleInput.nextDouble();
		double b = consoleInput.nextDouble();
		double c = consoleInput.nextDouble();
		double d = consoleInput.nextDouble();
		double e = consoleInput.nextDouble();
		double f = consoleInput.nextDouble();
		consoleInput.close();
		
		// Solve for (x, y)
		double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		
		// Display Results, check for 0
		if ((a * d) - (b * c) == 0)
			System.out.println("The equation has no solution");
		else
			System.out.println("x is " + x + " and y is " + y);
	}
}