// Clark Elliott - 9/8/2014
// L20274677
// COSC 1173 - Module 6

public class main {
	public static void main(String[] args) {
		
		System.out.println("Celsius     Fahrenheit");
		
		for (int temp=40; temp>30; temp--) { //Loops from 40.0 to 31.0 as seen in the Example
			celsiusToFahrenheit(temp);
		}
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		double Fahrenheit = ((9.0 / 5) * celsius + 32); //Converts C to F
		System.out.println((float)celsius + "        " + (float)Fahrenheit); //Casting to float to eliminate decimals
		return Fahrenheit;
	}
}
