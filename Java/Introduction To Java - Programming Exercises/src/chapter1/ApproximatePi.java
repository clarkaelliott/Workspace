package chapter1;

/*
 * Chapter 1.7 (Approximate Pi)
 * by Clark Elliott | Last Updated: 3/13/2016
 * 
 * 
 * Instructions:
 * Display the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/11 + 1/13)
 * 
 * Note: Use 1.0 instead of 1
 */

public class ApproximatePi {

	public static void main(String[] args) {

		double approxPi1 = (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) ) );
		double approxPi2 = (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13) ) );
		
		// Display Results, *Formatted for Convenience
		System.out.println( (int) (approxPi1 * 1000) / 1000.0);
		System.out.println( (int) (approxPi2 * 1000) / 1000.0);

	}

}
