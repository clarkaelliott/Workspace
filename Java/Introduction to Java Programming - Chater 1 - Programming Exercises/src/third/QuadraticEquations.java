package third;

import java.util.Scanner;

// 3.1
// Algebra: Solve Quadratic Equations

// ax^2 + bx + c = 0
// r1 = -b + sqrt(b^2 - 4ac) / 2a
// r2 = -b - sqrt(b^2 - 4ac) / 2a
// b^2 - 4ac is called the discriminant

// Positive = 2 roots, 0 = 1 root, negative = 0 roots

// Prompt User to Enter values A, B, and C
// Display Result based on the discriminant

public class QuadraticEquations {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		//double r1 = (-b + (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
		//double r1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		double r1 = (-b + Math.sqrt(Math.pow(b, 2.0) - (4.0 * a * c)) / (2.0 * a));
		double r2 = -b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5) / (2 * a);
		
		// Math is broken... TODO
		
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
		
		if (discriminant > 0)
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		else if (discriminant == 0)
			System.out.println("The equation has one root " + r1);
		else if (discriminant < 0)
			System.out.println("The equation has no real roots");
		
	}
	

}
