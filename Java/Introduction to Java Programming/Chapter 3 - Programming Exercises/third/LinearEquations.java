package third;

import java.util.Scanner;

// 3.3
// Algebra: Solve 2 X 2 Linear Equations

// Program Requirement Specifications --

// Using Cramer's Rule from PE 1.13
// Prompt User to Enter a, b, c, d, e, and f
// Display Result
// If ad - bc = 0, report that "The equation has no solution"

//ax + by = e
//cx + dy = f
//x = ed - bf / ad - bc
//y = af - ec / ad - bc

public class LinearEquations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		
		if ((a * d) - (b * c) == 0)
			System.out.println("The equation has no solution");
		else
			System.out.println("x is " + x + " and y is " + y);
		
		
		
	}
	
}
