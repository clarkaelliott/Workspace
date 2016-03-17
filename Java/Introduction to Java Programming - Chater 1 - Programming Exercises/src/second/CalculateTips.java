package second;

import java.util.Scanner;

// 2.5
// Financial Application: Calculate Tips

// Read a Subtotal and Gratuity Rate
// Compute Gratuity and Total
// Gratuity = Amount of Tip
// Total = Subtutal + Gratuity
// Display Result


public class CalculateTips {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		
		double subTotal = sc.nextDouble();
		double gratuityRate = (sc.nextDouble() / 100);
		
		double gratuity = (subTotal * gratuityRate);
		double total = (subTotal + gratuity);
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
	}
}
