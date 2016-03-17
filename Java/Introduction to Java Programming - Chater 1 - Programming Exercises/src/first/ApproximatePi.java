package first;

// This program will attempt to approximate pi

public class ApproximatePi {

	public static void main(String[] args) {
		
		double pi = (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		double pi2 = (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));
		
		// 1/3 is Truncated and Worthless, Double/Int returns a Double, Use This!
		
		System.out.println(pi);
		System.out.println(pi2);
		
	}
}
