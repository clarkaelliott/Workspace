package first;

// 1.13

// This program will use Cramer's rule to solve a 2x2 system of linear equation

// ax + by = e
// cx + dy = f
// x = ed - bf / ad - bc
// y = af - ec / ad - bc

public class AlgebraLinearEquation {

	public static void main(String[] args) {
		
		// Solve
		// 3.4x + 50.2y = 44.5
		// 2.1x + .55y = 5.9
		
		double a = 3.4;
		double b = 50.2;
		
		double c = 2.1;
		double d = 0.55;
		
		double e = 44.5;
		double f = 5.9;
		
		double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		
		System.out.println("Using Cramer's Rule\n3.4x + 50.2y = 44.5\n2.1x + .55y = 5.9\nEquals\nX = " + x + "\nY = " + y);
		
	}
}
