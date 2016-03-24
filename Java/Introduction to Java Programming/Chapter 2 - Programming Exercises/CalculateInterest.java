import java.util.Scanner;

// 2.20
// Financial Application: Calculate Interest

// Prompt User to Enter Balance & APR
// Display Interest for Next Month

// Interest = balance * (apr/1200)

public class CalculateInterest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = sc.nextDouble();
		double apr = sc.nextDouble();
		
		double interest = (balance * (apr / 1200));
		
		System.out.println("The interest is " + interest);
		
	}

}
