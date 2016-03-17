package chapter3;

import java.util.Scanner;

/*
 * Chapter 3.18 (Cost of Shipping)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * c(w) 3.5 if 0 < w <= 1
 * c(w) 5.5 if 1 < w <= 3
 * c(w) 8.5 if 3 < w <= 10
 * c(w) 10.5 if 10 < w <= 20
 * c = Cost(in dollars)
 * w = Weight(in pounds)
 * 
 * Prompt User to Enter the Weight
 * Display Shipping Cost
 * If Weight is > 50 Display a Message "the package cannot be shipped."
 */
public class ShippingCost {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		double cost = 3.5; // Will change according to weight entered
		
		// Collect Input
		System.out.print("Enter package weight in pounds: ");
		double weight = sc.nextDouble();
		
		// Process Input & Display Result
		// TODO Stopped Here... switch conditionals?  is that a thing?  if-else branches???  Goodnight World
		if (weight > 0.0 && weight <= 1.0)
			System.out.println("Cost to ship is " + (cost = 3.5));
		else if (weight > 1.0 && weight <= 3.0)
			System.out.println("Cost to ship is " + (cost = 5.5));
		else if (weight > 3.0 && weight <= 10.0)
			System.out.println("Cost to ship is " + (cost = 8.5));
		else if (weight > 10.0 && weight <= 20.0)
			System.out.println("Cost to ship is " + (cost = 10.5));
		else if (weight > 50.0)
			System.out.println("the package cannot be shipped.");
		else
			System.out.println("Function does not give a price for 0 or 20 < w <= 50");
				
		// Destroy Resources
		sc.close();

	}

}