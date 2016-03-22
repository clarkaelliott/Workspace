
/**
  * MyArray.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 18, 2016
  * 
  *
  * Notes:
  * 	My testing grounds for arrays...
  */

public class MyArray {

	public static void main(String[] args) {

		int sum = 0;
		int[][][] myArray = new int[30][30][30];
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				for (int k = 0; k < myArray[i][j].length; k++) {
					myArray[i][j][k] = sum;
					sum++;
				}
			}
		}		
			
		
		System.out.println("Total of " + sum + " indexes");
	}

}
