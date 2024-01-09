package string;

public class DuplicateChar {
	
	
	public static void duplicateChar(String str) {
	
		int uniccount=0;
		int duplicatecount=0;
	int charOccurrance[]=new int[256];
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' '){
		continue;
		
		}
		char c=str.charAt(i);
		charOccurrance[c]++;
	}
	
	for(int i=0;i<charOccurrance.length;i++) {
		if(charOccurrance[i]==1) {
		System.out.println("Ocuurance of  char "+(char)i+" is :"+charOccurrance[i]);
		uniccount++;
		}
		
		if(charOccurrance[i]>1) {
			System.out.println("Ocuurance of  char "+(char)i+" is :"+charOccurrance[i]);
		}
		 if(charOccurrance[i]>1) {
			 duplicatecount++;
			
		}
		
		
	}
	System.out.println(uniccount);
		System.out.println(duplicatecount);
		
	}
	


	public static void main(String[] args) {
		
	String str= "Varsha Matkar";
	
DuplicateChar.duplicateChar(str);
}
}