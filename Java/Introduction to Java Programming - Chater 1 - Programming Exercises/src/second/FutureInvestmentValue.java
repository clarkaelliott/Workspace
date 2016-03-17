package second;

import java.util.Scanner;

// 2.21
// Financial Application: Calculate Future Investment Value

// Read In Investment Amount, APR, # of Years
// Display the Future Investment Value
// futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) ^ numberOfYears * 12

public class FutureInvestmentValue {

	public static void main(String[] args) {
		
		System.out.print("Enter investment amount: ");
		
		Scanner sc = new Scanner(System.in);
		
		double investmentAmount = sc.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		
		double annualInterestRate = sc.nextDouble() / 100;
		double monthlyInterestRate = annualInterestRate / 12;
		
		System.out.print("Enter number of years: ");
		
		double numberOfYears = sc.nextDouble();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
		
		System.out.println("Accumulated value is $" + futureInvestmentValue);
		
	}
	
}
