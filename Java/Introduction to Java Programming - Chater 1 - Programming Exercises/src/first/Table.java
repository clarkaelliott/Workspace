package first;

// This program prints a table to console

public class Table {

	public static void main(String[] args) {
				
		System.out.println("a     a^2     a^3");
		
		for (int a = 1; a < 5; a++) {
			
		System.out.println(a + "     " + Math.pow(a, 2) + "     " + Math.pow(a, 3));
		
		}
		
	}
}
