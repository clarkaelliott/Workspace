
/**
  * PrintTable2.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 24, 2016
  * 
  *
  * Chapter 2.18 - (Print a Table)
  * 
  * Instructions:
  * 	TODO
  * 
  * Notes:
  * 	Cast Floating-Point Numbers into Integers
  */

public class PrintTable2 {
	
	public static void main(String[] args) {
		
		System.out.println("a   b   pow(a, b)");
		
		for (int i = 1; i <6; i++) {
			System.out.println(i + "   " + (i + 1) + "   " + (int)(Math.pow(i, i + 1)));
		}
		
		
	}

}
