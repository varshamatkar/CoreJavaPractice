package string;

	public class CoutUpperLowerCase {
		
		public static void coutChar(String str) {
			
			int upperCase=0;
			int lowerCase=0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>=65 && str.charAt(i)<90) {
					upperCase++;
					
				}
				else if(str.charAt(i)>=97&&str.charAt(i)<122){
					lowerCase++;
				}
			}
			
			System.out.println("Count of upperCase char :"+upperCase);
		System.out.println("Count of lowerCase char :"+lowerCase);
	
		}
		
    
		
		
		
	public static void main(String[] args) {
			String str="Varsha Matkar";
		CoutUpperLowerCase.coutChar(str);
			
		}
	
	}
