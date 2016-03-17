package chapter1;

/*
 * Chapter 1.13 (Algebra: Solve 2 X 2 Linear Equations)
 * by Clark Elliott | Last Updated: 3/15/2016
 * 
 * 
 * Instructions:
 * Using Cramer's Rule --
 * ax + by = e
 * cx + dy = f
 * x = (ed - bf) / (ad - bc)
 * y = (af - ec) / (ad - bc)
 * 
 * Solve The Following, Display x and y
 * 
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */


public class SolveLinearEquations {
	
	public static void main(String[] args) {
		
		double a = 3.4;
		double b = 50.2;		
		double c = 2.1;
		double d = 0.55;		
		double e = 44.5;
		double f = 5.9;
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		System.out.println("Using Cramer's Rule\n3.4x + 50.2y = 44.5\n2.1x + .55y = 5.9\n\nX = " + x + " |  Y = " + y);
		
	}

}
