package chapter2;

import java.util.Scanner;

// 2.15
// Geometry: Distance of Two Points

// Prompt User to Enter 2 Points (x1, y1) & (x2, y2)
// Display Distance Between the 2 Points

// Distance Formula is Sqrt(x2-x1)^2 + (y2-y1)^2

public class DistanceFormula {
	
	public static void main(String[] args) {
		
		// Collect Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		// Process Input
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		// Display Output
		
		System.out.println("The distance between the two points is " + distance);
	}

}
