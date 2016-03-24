import java.util.Scanner;

// 2.23
// Cost of Driving

// Prompt User to Enter the Distance to drive, miles per gallon, price per gallon
// Display Cost of Trip

public class DrivingCost {
	
	public static void main(String[] args) {
		
		// Collect Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = sc.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double mpg = sc.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double ppg = sc.nextDouble();
		
		// Process Input
		
		double tripCost = (distance / mpg) * ppg;
		
		// Display Results
		
		System.out.println("The cost of driving is $" + (int)(tripCost *100) / 100.0);
		
	}
	
}
