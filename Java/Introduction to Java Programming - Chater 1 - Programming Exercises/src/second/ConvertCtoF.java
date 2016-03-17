package second;

import java.util.Scanner;

// 2.1
// Convert Celsius to Fahrenheit

// This program reads a Celsius degree in a double value from console
// then converts it to Fahrenheit and displays the result to console
// using fahrenheit = (9 / 5) * celsius + 32
// Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8

public class ConvertCtoF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = (((9.0 / 5.0) * celsius) + 32);
		
		System.out.print("Please Enter a Temperature in Celsius: ");
		
		celsius = sc.nextDouble();
		fahrenheit = (((9.0 / 5.0) * celsius) + 32);
		
		System.out.println(celsius + " Celsius is Equal to " + fahrenheit + " Fahrenheit.");
	}
	
}
