package finbonacci;

public class ReverseNumber {
	
	public static void reverseNumber(int number) {
		String number2=Integer.toString(number);
		String s= new StringBuilder(number2).reverse().toString();
		int orignalNumber=Integer.parseInt(s);
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		int number=123;
		reverseNumber(number);

	}

}
