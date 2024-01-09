package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetEx {

	public static void main(String[] args) {
	HashSet<String>s= new HashSet<>();
	s.add("Varsha");
	s.add("Matkar");
	s.add("Sama");
	s.add("Kartik");
	s.add("Sama");
	s.add(null);
	s.add(null);

	System.out.println(s);
	
	LinkedHashSet<String>s1= new LinkedHashSet<>();
	s1.add("Varsha");
	s1.add("Matkar");
	s1.add("Sama");
	s1.add("Kartik");
	s1.add("Sama");
	System.out.println(s1);
	
	
	
	TreeSet<String>s2= new TreeSet<>();
	s2.add("Varsha");
	s2.add("Matkar");
	s2.add("Sama");
	s2.add("Kartik");
	s2.add("Sama");
	
	
	System.out.println(s2);
	}
	
	
}
