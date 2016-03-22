import java.util.Scanner;

/**
  * ConvertCelsiusToFahrenheit.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 2.1 - (Convert Celsius to Fahrenheit)
  * 
  * Instructions:
  * 	Prompt User to Enter a Celsius Degree as a Double
  * 	Convert Input to Fahrenheit & Display Result
  * 
  * Notes:
  * 	Fahrenheit = (9 / 5) * Celsius + 32
  */

public class ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		// Local Variables
		double celsius, fahrenheit;
		
		// Request Celsius from Console
		System.out.print("Please Enter a Temperature in Celsius: ");
		celsius = sc.nextDouble();
		
		// Convert Celsius to Fahrenheit
		fahrenheit = (9.0 / 5.0) * celsius + 32;
				
		// Display Result
		System.out.printf(celsius + " Celsius is Equal to %3.1f ", fahrenheit);
		
		// Destroy Resources
		sc.close();

	}

}
