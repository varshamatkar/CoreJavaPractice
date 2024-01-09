package exception;

public class ThrowsKeyword {
	
	
	public static void checkString(String str) throws StringIndexOutOfBoundsException{
		
			System.out.println(str.charAt(10));
		}
	

	public static void main(String[] args) {
		
		try {
			checkString("varsha");
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
