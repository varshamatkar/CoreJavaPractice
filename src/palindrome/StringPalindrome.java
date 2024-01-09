package palindrome;

public class StringPalindrome {
	
	public static void checkStringPalindrome(String str,String rev) {
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("Revrese string: "+rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrome");
			
		}
		else {
			System.out.println("Given string is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		String str="Madam";
		System.out.println("Given string: "+str);
		String rev="";
		
		StringPalindrome.checkStringPalindrome(str, rev);

	}

}
