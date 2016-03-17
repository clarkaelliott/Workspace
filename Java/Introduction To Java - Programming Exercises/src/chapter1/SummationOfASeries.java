package chapter1;

/*
 * Chapter 1.6 (Summation of a Series)
 * by Clark Elliott | Last Updated: 3/13/2016
 * 
 * 
 * Instructions:
 * Display the Result of
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
 */

public class SummationOfASeries {

	public static void main(String[] args) {

		int sum = 0; // Variable to store result
		
		// Sum (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9)
		for (int i = 1; i < 10; i++) {
			sum += i;
		}
		
		// Display Result
		System.out.println(sum);

	}

}
