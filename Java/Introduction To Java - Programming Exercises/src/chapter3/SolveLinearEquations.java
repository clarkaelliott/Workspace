package chapter3;

//	Chapter 3.3
//	Algebra: Solve 2 X 2 Linear Equations

//	Last Update: 3/7/2016 by Clark Elliott

//	Prompt user to enter a, b, c, d, e, and f
//	Display result using Cramer's Rule
//	If ad - bc = 0 report that "The equation has no solution."

//	Cramer's Rule -
//	ax + by = e
//	cx + dy = f
//	x = ed - bf / ad - bc
//	y = af - ec / ad - bc

//	*Demonstrates Operator Precedence & If Statement

import java.util.Scanner;

public class SolveLinearEquations {

	public static void main(String[] args) {
		
		//Create Resources
		Scanner sc = new Scanner(System.in);
		
		//Collect Input
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		//Process Input
		double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		
		//Display Result
		if ((a * d) - (b * c) == 0)
			System.out.println("The equation has no solution");
		else
			System.out.println("x is " + x + " and y is " + y);
		
		//Destroy Resources
		sc.close();		
		
	}

}