package finbonacci;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		int count=10;
		int firstNumber=0;
		int secondNumber=1;
		System.out.print(firstNumber+" ");
		System.out.print(secondNumber);
		for(int i=2;i<=count;i++) {
			int thirdNumber=firstNumber+secondNumber;
			System.out.print(" " +thirdNumber+" ");
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
		
		}
		
		

	}

}
