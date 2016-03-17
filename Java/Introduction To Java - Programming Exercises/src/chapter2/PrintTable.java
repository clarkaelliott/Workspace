package chapter2;

// 2.18
// Print a Table

// Display Table from pg 73 2.18
// Cast floating-point numbers into integers

public class PrintTable {

	public static void main(String[] args) {
		
		System.out.println("a   b   pow(a, b)");
		
		for (int i = 1; i <6; i++) {
			System.out.println(i + "   " + (i + 1) + "   " + (int)(Math.pow(i, i + 1)));
		}
		
		
	}
	
}
