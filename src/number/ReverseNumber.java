package number;

public class ReverseNumber {
	
	public static int reverseNumber(int number) {
	String s= Integer.toString(number);
	String sb= new StringBuilder(s).reverse().toString();
	int n= Integer.parseInt(sb);
	return n;
	
	}
	
	
	public  static void reverseNumber2(String number) {
		String rev="";
		for(int i=number.length()-1;i>=0;i--) {
			rev= rev+number.charAt(i);
		}
		if(number.equalsIgnoreCase(rev)) {
			
			System.out.println("Given number "+ number+" is palindrome");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		int number=123;
		
		System.out.println("Original Number: "+number);
		System.out.println("Reverse Number is : "+ReverseNumber.reverseNumber(number));
        ReverseNumber.reverseNumber2("424");
		
	}
}