import java.util.Scanner;

// 2.10
// Science: Calculating Energy

// Calculate Energy needed to heat water from an Initial Temperature to a Final Temperature
// Prompt User to Enter Amount of Water in Kilograms and Initial & Final Temperatures

// Q = M * (finalTemperature - initialTemperature) * 4184
// M = Weight of Water in Kilograms
// Q is Energy measured in Joules
// Temperatures are in Celsius

public class ScienceCalcEnergy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		
		double waterInKilograms = sc.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		
		double initialTemperature = sc.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		
		double finalTemperature = sc.nextDouble();
		
		double result = (waterInKilograms * (finalTemperature - initialTemperature) * 4184);
		System.out.println("The energy needed is " + result);
		
	}
}
