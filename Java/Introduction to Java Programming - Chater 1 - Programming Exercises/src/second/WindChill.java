package second;

import java.util.Scanner;

// 2.17
// Science: Wind-Chill Temperature

// Prompt User to Enter a Temperature in Farenheit between -58 and 41
// twc = 35.74 + 0.6215(Temp outside) - 35.75(wind speed mph) + 0.4275(temp outside ^ wind speed)

public class WindChill {

	public static void main(String[] args) {
		
		// Collect Input
		
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		
		Scanner sc = new Scanner(System.in);
		
		double tempOutside = sc.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		
		double windSpeed = sc.nextDouble();
		
		// Process Input
		
		double windChill = (35.74 + (0.6215 * tempOutside) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * (tempOutside * Math.pow(windSpeed, 0.16))));		
		
		// Display Output
		
		System.out.println("The wind chill index is " + windChill);
		
	}
}
