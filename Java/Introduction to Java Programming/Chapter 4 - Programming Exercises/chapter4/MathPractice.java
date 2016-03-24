package chapter4;

// This is a testing ground to familiarize myself with Java's Math Class

public class MathPractice {

	public static void main(String[] args) {
		
		// Math.abs(double a) Returns Absolute Value
		
		System.out.println("Math.abs(double a) - Returns Absolute Value\n");
		System.out.println(Math.abs(0)); // 0
		System.out.println(Math.abs(0.0d)); // 0
		System.out.println(Math.abs(0.0f));
		System.out.println(Math.abs(Long.MIN_VALUE + 1));
		System.out.println(Math.abs(Long.MAX_VALUE));
		
		System.out.println(Math.abs(Double.MIN_VALUE));
		System.out.println(Math.abs(Float.MIN_VALUE));
		System.out.println(Math.abs(Integer.MIN_VALUE) );
		System.out.println(Math.abs(Integer.MIN_VALUE +1 ) );
		System.out.println(Math.abs(Integer.MIN_VALUE) +1);
		System.out.println(Math.abs(Long.MIN_VALUE +1));
				
		System.out.println("Cos");
		System.out.println(Math.cos(0));
		System.out.println(Math.cos(0.0));
		System.out.println(Math.cos(0.0f));
		System.out.println(Math.cos(0L));
		System.out.println(Math.cos(1));
		System.out.println(Math.cos(-1));
		System.out.println(Math.cos(1.0f));
		System.out.println(Math.cos(-1.0f));

	}

}
