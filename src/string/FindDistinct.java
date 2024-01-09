package string;

import java.util.LinkedHashSet;

public class FindDistinct {

	public static void main(String[] args) {
	String str="varsha";
	
	LinkedHashSet<Character>s= new LinkedHashSet<>();
	
	for(int i=0;i< str.length();i++) {
		s.add(str.charAt(i));
	}

	System.out.println(s.size());
	}

}
