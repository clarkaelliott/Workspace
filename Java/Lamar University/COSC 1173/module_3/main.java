package module_3;

import java.util.Scanner;

/*Clark Elliott 9/3/2014
COSC 1173 - Module 3
"Convert Pounds into Kilograms" */

public class main {

	public static void main(String[] args) {	
		
		double kg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number in pounds: ");
		double lbs = sc.nextFloat();
		
		kg = lbs * 0.453592; //Converts pounds to kilograms.
		
		System.out.println(lbs + " pounds is " + kg + " kilograms.");
		
	}
}
