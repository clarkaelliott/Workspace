package chriskmee;

public class Main {
	
	public static void main(String[] args) {
		
		int[] testArray = {1, 55, 16, 73, 65, 101, 69, 55, 44, 33, 22};
		
		System.out.println("Highest Number = " + findMax(testArray));
		System.out.println("Smaller Number = " + findMin(testArray));
		
		System.out.println("Testing String: Apple");
		System.out.println(isPalindrome("Apple"));
		
		System.out.println("Testing String: Racecar");
		System.out.println(isPalindrome("Racecar"));
		
	}
	
	public static boolean isPalindrome(String string) {
		String testString = string.toLowerCase();
		boolean result = false;
		
		for (int i = 0; i < testString.length(); i++) {
			
			//System.out.println("i = " + i + " " + testString.charAt(i) + " " + testString.charAt(testString.length() - (1 + i) ) );
			if (testString.charAt(i) == testString.charAt(testString.length() - (1 + i) ) ) {
				result = true;
				//System.out.println("i = " + i);
				
			}
			else {
				return false;
			}
				
		}
		return result;
	}
	
	public static int findMax(int[] number) {
		
		int[] testNum = number;
		int numToReturn = Integer.MIN_VALUE;
		
		for (int i = 0; i < testNum.length; i++) {
			if (testNum[i] > numToReturn)
				numToReturn = testNum[i];
		}
		
		return numToReturn;
		
	}
	
	public static int findMin(int[] number) {
		
		int[] testNum = number;
		int numToReturn = Integer.MAX_VALUE;
		
		for (int i = 0; i < testNum.length; i++) {
			if (testNum[i] < numToReturn)
				numToReturn = testNum[i];
		}
		
		return numToReturn;
		
	}

}

