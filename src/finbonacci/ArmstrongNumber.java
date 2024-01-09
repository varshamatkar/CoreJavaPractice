package finbonacci;



public class ArmstrongNumber {
	
	public static void findArmstromg(int number) {
		
		int orignalNumber=number;
		int result=0;
		int n=String.valueOf(number).length();
		
		while(number!=0) {
			
			int digit=number%10;
			result=(int) (result+Math.pow(digit, n));
			number=number/10;
			
			
		}
		System.out.println(orignalNumber);
		System.out.println(result);
		if(orignalNumber==result) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not aarmstrong number");
		}
	}

	public static void main(String[] args) {
		
		int number=371;
		findArmstromg(number);
	
		

	}

}
