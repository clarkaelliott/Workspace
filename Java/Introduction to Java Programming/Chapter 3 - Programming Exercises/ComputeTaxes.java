

import java.util.Scanner;

/*
 * Chapter 3.13 (Financial Application: Compute Taxes)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Complete Listing 3.5 ComputeTax.java to Compute the Taxes for All Filing Statuses
 * 0-Single, 1-Married, Widow, 2-Seperate, 3-Head (5 Statuses)
 */

public class ComputeTaxes {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Collect Input
		System.out.println("0-Single | 1-Married Joint or Qualifying Widow | 2-Married Seperate | 3-Head of Household");
		System.out.print("Enter Filing Status: ");
		int status = sc.nextInt();
		System.out.print("Enter the Taxable Income: ");
		double income = sc.nextDouble();
		
		// Process Input
		double tax = 0;
		// 2009 U.S. Federal Personal Tax Rates
		double singleFilerBracket[] = { 8350.00, 33950.00, 82250.00, 171550.00, 372950.00 };
		double jointFilerBracket[] = { 16700.00, 67900.00, 137050.00, 208850.00, 372950.00 };
		double seperateFilerBracket[] = { 8350.00, 33950.00, 68525.00, 104425.00, 186475.00 };
		double headFilerBracket[] = { 11950.00, 45500.00, 117450.00, 190200.00, 372950.00 };
				
		if (status == 0) {
			if (income <= singleFilerBracket[0])
				tax = income * 0.10;
			else if (income <= singleFilerBracket[1])
				tax = singleFilerBracket[0] * 0.10 + (income - singleFilerBracket[0]) * 0.15;
			else if (income <= singleFilerBracket[2])
				tax = singleFilerBracket[0] * 0.10 + (singleFilerBracket[1] - singleFilerBracket[0]) * 0.15 + (income - 33950) * 0.25;
			else if (income <= singleFilerBracket[3])
				tax = singleFilerBracket[0] * 0.10 + (singleFilerBracket[1] - singleFilerBracket[0]) * 0.15 + (singleFilerBracket[2] - singleFilerBracket[1]) * 0.25 + (income - singleFilerBracket[2]) * 0.28;
			else if (income <= singleFilerBracket[4])
				tax = singleFilerBracket[0] * 0.10 + (singleFilerBracket[1] - singleFilerBracket[0]) * 0.15 + (singleFilerBracket[2] - singleFilerBracket[1]) * 0.25 + (singleFilerBracket[3] - singleFilerBracket[2]) * 0.28 + (income - singleFilerBracket[3]) * 0.33;
			else
				tax = singleFilerBracket[0] * 0.10 + (singleFilerBracket[1] - singleFilerBracket[0]) * 0.15 + (singleFilerBracket[2] - singleFilerBracket[1]) * 0.25 + (singleFilerBracket[3] - singleFilerBracket[2]) * 0.28 + (singleFilerBracket[4] - singleFilerBracket[3]) * 0.33 + (income - singleFilerBracket[4]) * 0.35;
		}
		else if (status == 1) {
			if (income <= jointFilerBracket[0])
				tax = income * 0.10;
			else if (income <= jointFilerBracket[1])
				tax = jointFilerBracket[0] * 0.10 + (income - jointFilerBracket[0]) * 0.15;
			else if (income <= jointFilerBracket[2])
				tax = jointFilerBracket[0] * 0.10 + (jointFilerBracket[1] - jointFilerBracket[0]) * 0.15 + (income - jointFilerBracket[1]) * 0.25;
			else if (income <= jointFilerBracket[3])
				tax = jointFilerBracket[0] * 0.10 + (jointFilerBracket[1] - jointFilerBracket[0]) * 0.15 + (jointFilerBracket[2] - jointFilerBracket[1]) * 0.25 + (income - jointFilerBracket[2]) * 0.28;
			else if (income <= jointFilerBracket[4])
				tax = jointFilerBracket[0] * 0.10 + (jointFilerBracket[1] - jointFilerBracket[0]) * 0.15 + (jointFilerBracket[2] - jointFilerBracket[1]) * 0.25 + (jointFilerBracket[3] - jointFilerBracket[2]) * 0.28 + (income - jointFilerBracket[3]) * 0.33;
			else
				tax = jointFilerBracket[0] * 0.10 + (jointFilerBracket[1] - jointFilerBracket[0]) * 0.15 + (jointFilerBracket[2] - jointFilerBracket[1]) * 0.25 + (jointFilerBracket[3] - jointFilerBracket[2]) * 0.28 + (jointFilerBracket[4] - jointFilerBracket[3]) * 0.33 + (income - jointFilerBracket[4]) * 0.35;
		}
		else if (status == 2) {
			if (income <= seperateFilerBracket[0])
				tax = income * 0.10;
			else if (income <= seperateFilerBracket[1])
				tax = seperateFilerBracket[0] * 0.10 + (income - seperateFilerBracket[0]) * 0.15;
			else if (income <= seperateFilerBracket[2])
				tax = seperateFilerBracket[0] * 0.10 + (seperateFilerBracket[1] - seperateFilerBracket[0]) * 0.15 + (income - seperateFilerBracket[1]) * 0.25;
			else if (income <= seperateFilerBracket[3])
				tax = seperateFilerBracket[0] * 0.10 + (seperateFilerBracket[1] - seperateFilerBracket[0]) * 0.15 + (seperateFilerBracket[2] - seperateFilerBracket[1]) * 0.25 + (income - seperateFilerBracket[2]) * 0.28;
			else if (income <= seperateFilerBracket[4])
				tax = seperateFilerBracket[0] * 0.10 + (seperateFilerBracket[1] - seperateFilerBracket[0]) * 0.15 + (seperateFilerBracket[2] - seperateFilerBracket[1]) * 0.25 + (seperateFilerBracket[3] - seperateFilerBracket[2]) * 0.28 + (income - seperateFilerBracket[3]) * 0.33;
			else
				tax = seperateFilerBracket[0] * 0.10 + (seperateFilerBracket[1] - seperateFilerBracket[0]) * 0.15 + (seperateFilerBracket[2] - seperateFilerBracket[1]) * 0.25 + (seperateFilerBracket[3] - seperateFilerBracket[2]) * 0.28 + (seperateFilerBracket[4] - seperateFilerBracket[3]) * 0.33 + (income - seperateFilerBracket[4]) * 0.35;
		}
		else if (status == 3) {
			if (income <= headFilerBracket[0])
				tax = income * 0.10;
			else if (income <= headFilerBracket[1])
				tax = headFilerBracket[0] * 0.10 + (income - headFilerBracket[0]) * 0.15;
			else if (income <= headFilerBracket[2])
				tax = headFilerBracket[0] * 0.10 + (headFilerBracket[1] - headFilerBracket[0]) * 0.15 + (income - headFilerBracket[1]) * 0.25;
			else if (income <= headFilerBracket[3])
				tax = headFilerBracket[0] * 0.10 + (headFilerBracket[1] - headFilerBracket[0]) * 0.15 + (headFilerBracket[2] - headFilerBracket[1]) * 0.25 + (income - headFilerBracket[2]) * 0.28;
			else if (income <= headFilerBracket[4])
				tax = headFilerBracket[0] * 0.10 + (headFilerBracket[1] - headFilerBracket[0]) * 0.15 + (headFilerBracket[2] - headFilerBracket[1]) * 0.25 + (headFilerBracket[3] - headFilerBracket[2]) * 0.28 + (income - headFilerBracket[3]) * 0.33;
			else
				tax = headFilerBracket[0] * 0.10 + (headFilerBracket[1] - headFilerBracket[0]) * 0.15 + (headFilerBracket[2] - headFilerBracket[1]) * 0.25 + (headFilerBracket[3] - headFilerBracket[2]) * 0.28 + (headFilerBracket[4] - headFilerBracket[3]) * 0.33 + (income - headFilerBracket[4]) * 0.35;
		}
		else {
			System.out.println("Invalid Status");
			System.exit(1);
		}
		
		// Display Result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
				
	}
	
}