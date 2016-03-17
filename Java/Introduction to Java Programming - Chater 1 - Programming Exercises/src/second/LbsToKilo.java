package second;

import java.util.Scanner;

// 2.4
// Convert Pounds into Kilograms

// Prompt User to Enter a Number in Pounds
// Convert it to Kilograms
// Display the Result

// 1 Pound = 0.454 Kilograms


public class LbsToKilo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		
		double pounds = sc.nextDouble();
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
