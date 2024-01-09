package number;

public class ArmstrongNumber {
	
	public static void armstrongNumber(int number) {
		
		int orignalNumber=number;
		int digit=0;
		int result=0;
		int numberofdigit=Integer.toString(number).length();
	
		
		while(number!=0) {
			
			digit=number%10;
			
			result=(int) (result+ Math.pow(digit,numberofdigit)) ;
			number=number/10;
			
		}
		System.out.println(result);
		if(orignalNumber==result) {
			System.out.println("Given number is armstrong number");
		}
		else {
			System.out.println("Given number is not Armstrong number");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int number=153;
		armstrongNumber(number);
		
	}

}
