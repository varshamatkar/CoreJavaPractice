package string;

public class FindLargestNumberString {
	
	
	
	public static void findLargestNumberFromString(String s) {
		String s2=s.replace(",", "");
		String str[]=s2.split("");
		
		int largestNumber= Integer.parseInt(str[0]);
		for(int i=0;i<str.length;i++) {
			int currentNumber=Integer.parseInt(str[i]);
			if(currentNumber>largestNumber) {
				largestNumber=currentNumber;
			
			}
			
		}
		System.out.println("Largest Number in given  is: "+largestNumber);
		
	}
	
	

	public static void main(String[] args) {
		String s="1,234515896";
		findLargestNumberFromString(s);
		
	}

}
