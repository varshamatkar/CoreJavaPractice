package PrimeNumber;

public class CheckPrimeNumber {
	
	public  static boolean isNumberPrime(int number) {
		
		if(number<=1) {
			return false;
		}
		
		for(int i=2;i<number;i++) {
		
			if(number%i==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number=3;
		if(isNumberPrime(number)){
			System.out.println("Number is prime");
			
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}

}
