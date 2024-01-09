package exception;

public class ExampleWithThrows {
	
	public static void checkDenominator(int a, int b) throws ArithmeticException {
		
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {
		
		try {
			checkDenominator(10, 0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
