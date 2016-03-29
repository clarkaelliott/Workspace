

import java.util.Scanner;

/*
 * Chapter 3.25 (Geometry: Intersecting Point)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Use Cramer's Rule -
 * 
 * 
 * To Solve -
 * 
 */

// TODO Return To Later, Arithmetic Error 3/8/2016

public class IntersectingPoint {
	
	public static void main(String[] args) {
		
		//Create Resources
		Scanner sc = new Scanner(System.in);
		double x, y, x1, y1, x2, y2, x3, y3, x4, y4;
		double a, b, c, d, e, f;
		boolean intersect1;
		boolean intersect2;
				
		//Collect Input
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();		
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		x4 = sc.nextDouble();
		y4 = sc.nextDouble();	
		
		//Process Input
		a = (y1 - y2);
		b = (x1 - x2);
		c = (y3 - y4);
		d = (x3 - x4);
		e = (a + b);
		f = (c + d);
		x = ( ( (e * d) - (b * f) ) / ( (a * d) - (b * c) ) );
		y = ( ( (a * f) - (e * c) ) / ( (a * d) - (b * c) ) );
		//intersect1 = ( ( (y1 - y2) * x) - ( (x1 - x2) * y) == ( (y1 - y2) * x1) - ( (x1 - x2) * y1) );
		//intersect2 = ( ( (y3 - y4) * x) - ( (x3 - x4) * y) == ( (y3 - y4) * x3) - ( (x3 - x4) * y3) );
		
		//Display Result
			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
				
		//Destroy Resources
		sc.close();		
		
	}

}
