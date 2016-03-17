
/**
  * SolveLinearEquations.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 1.13 - (Algebra: Solve 2 X 2 Linear Equations)
  * 
  * Instructions:
  * 	Solve
  * 	3.4x + 50.2y = 44.5
  * 	2.1x + .55y = 5.9
  * 	Display the Value for x and y
  * 
  * Notes:
  * 	ax + by = e
  * 	cx + dy = f
  * 	x = (ed - bf) / (ad - bc)
  * 	y = (af - ec) / (ad - bc)
  */

public class SolveLinearEquations {

	public static void main(String[] args) {

		// Local Variables
		double x, y;
		double a = 3.4;
		double b = 50.2;		
		double c = 2.1;
		double d = 0.55;		
		double e = 44.5;
		double f = 5.9;
		
		// Solve Equations
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		
		// Display Results
		System.out.println("x: " + x + "\ny: " + y);
		
	}

}
