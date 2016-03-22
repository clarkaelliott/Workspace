package module_7;

/** Clark Elliott L20274677
 *  10/8/2014
 *  Module #7 (Single Dimensional Array)  */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int arraySize = 0;
		boolean getInput = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input the size of array: ");
		
		while (arraySize<=0) {
			if (sc.hasNextInt()) {
				arraySize = sc.nextInt();
			} else {
				System.out.print("Please Enter a valid Number: ");
			} String clearBuffer = sc.nextLine();
		}
		
		double doubleArray[] = new double[arraySize];
		
		System.out.print("Please input " + arraySize + " double numbers: ");
		
		for (int i = 0; i < arraySize; i++) {
			if (i>0)
				System.out.print("Please input the next double: ");
			try {				
				doubleArray[i] = sc.nextDouble();
			} catch(InputMismatchException exception) {
				System.out.print("Please Enter Numbers only!\n");
				i--;
				sc.next();
			}	
		}
		System.out.println("After reverse order: ");
		for (int i = (arraySize-1); i > -1; i--) {
			System.out.print(doubleArray[i] + " ");
		}
		// FLIP ARRAY! -15 POINTS OTHERWISE!!!!!!!!
	}
}