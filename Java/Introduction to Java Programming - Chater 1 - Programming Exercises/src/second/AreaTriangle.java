package second;

import java.util.Scanner;

// 2.19
// Geometry: Area of a Triangle

// Prompt User to Enter 3 Points (x1, y1), (x2, y2), (x3, y3) of a Triangle
// Display the Triangle's Area

// A = sqrt(s(s-s1)(s-s2)(s-s3))
// s = (s1 + s2 + s3) / 2
// d = sqrt((x2-x1)^2 + (y2-y1)^2)

public class AreaTriangle {
	
	public static void main(String[] args) {
		
		// Collect Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		// Process Input
		
		double s1 = (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		double s2 = (Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
		double s3 = (Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		double s = ((s1 + s2 + s3) / 2);
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		// Display Output
		
		System.out.println("The area of the triangle is " + area);
		
	}

}
