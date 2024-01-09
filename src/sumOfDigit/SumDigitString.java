package sumOfDigit;

public class SumDigitString {
	
	public static int  sumofDigit(int number) {
		
		
		String str=Integer.toString(number);
		
		int digitSum=0;
		for(int i=0;i<str.length();i++) {
			char digitChar=str.charAt(i);
			digitSum=digitSum+Character.getNumericValue(digitChar);
		}
		return digitSum;
	
	}

	public static void main(String[] args) {
		int number=123;
		System.out.println("Sum of digit "+number+" is: "+SumDigitString.sumofDigit(number));
	
	}

}
