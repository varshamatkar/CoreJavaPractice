package string;

import java.util.Arrays;

public class OccuranceChar {
	
	
	
	public static void ocurranceChar(String str) {
		
		int charOccurance[]=new int[256];
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			
			charOccurance[c]++;
			
		}
		
		for(int i=0;i<charOccurance.length;i++) {
			if(charOccurance[i]>1) {
				System.out.println("occurance of  char: "+(char)i+" is: "+charOccurance[i]);
				
			}
			
		}
		
		
	}
		

	public static void main(String[] args) {
		
		String str="Varshavrshaaa";
		ocurranceChar(str);
	}

}
