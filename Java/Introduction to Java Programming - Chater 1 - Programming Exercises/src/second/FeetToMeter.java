package second;

import java.util.Scanner;

// 2.3
// Convert Feet into Meters

// Read a Number in Feet
// Convert it to Meters
// Display Result

// 1 Foot = 0.305 Meter

public class FeetToMeter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a vlue for feet: ");
		
		double feet = sc.nextDouble();
		double meters = (feet * 0.305);
		
		System.out.println(feet + " feet is " + meters + " meters");
		
	}

}
