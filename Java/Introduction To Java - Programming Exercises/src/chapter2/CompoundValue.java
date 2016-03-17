package chapter2;

import java.util.Scanner;

// 2.13
// Financial Application: Compound Value

// Prompt User to Enter a Monthly Saving Amount (Will be deposited each month)
// Display the Account Value after the Sixth Month

// $100 each Month with 5% APR = 0.05/12 Monthly Interest = 0.00417

public class CompoundValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		
		double depositAmount = sc.nextDouble();
		double balance = 0;
		double monthlyInterest = 1.00417;
		
		for (int i = 0; i < 6; i++) {
			balance += depositAmount;
			balance *= monthlyInterest;
			System.out.println(balance);
		}
		
		System.out.println("After the sixth month, the account value is $" + balance);
	}
}
