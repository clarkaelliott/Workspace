/*Clark Elliott 9/3/2014
COSC 1173 - Module 4
"Selection Statements" */

import java.util.Scanner;

public class main {
	
	//Sort method to organize the Array we will get from the user.
	public static void BubbleSort(int[] num )
	{
	     int i;
	     boolean flag = true; // sort loop starts here
	     int temp;   //place holder

	     while ( flag )
	     {
	            flag = false; 
	            for( i=0;  i < num.length -1;  i++ )
	            {
	                   if ( num[i] < num[i+1] ) // sorts descending
	                   {
	                           temp = num[i];                
	                           num[i] = num[i+1];
	                           num[i+1] = temp;
	                          flag = true;
	                  } 
	            } 
	      } 
	} 
	
public static void printInput(int[] userNumbers) {
		
		System.out.println(userNumbers[0] + " is the largest.");
		System.out.println(userNumbers[2] + " is the smallest.");
	}
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input three integers: ");
		
		int[] userNumbers = new int[3];		
		String getNumbers = sc.nextLine();
		String[] numbers1 = getNumbers.split(" ");
		for(int i=0; i<numbers1.length;i++) {
			userNumbers[i] = Integer.parseInt(numbers1[i]);
		}
				
		BubbleSort(userNumbers);
		printInput(userNumbers);

	}
}
	
