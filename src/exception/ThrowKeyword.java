package exception;

public class ThrowKeyword {
	
	
	public static void checkDenominator(int a, int b) {
		if(b<=0) {
			throw new ArithmeticException("Denominator can not be 0");
		}
		else {
			System.out.println(a/b);
		}
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
