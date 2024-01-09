package factorial;

public class FactorialOfNumber {
	
	public static int findFactoralNumber(int number) {
		
		int factorial=1;
		
		for(int i=1; i<=number;i++){
			factorial=factorial*i;
			
		}
		return factorial;
		
	}
	
	
	public static void main(String[] args) {
		int number=0;
		int result=findFactoralNumber(number);
		if(number<0) {
			System.out.println("Factorial is not defined for negative numbers.");
		}
			else {
				System.out.println("Factorial of " + number + " is: " + result);
			}
		
			
		}
	}


