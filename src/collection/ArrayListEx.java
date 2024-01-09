package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<>();
		ArrayList<String> str=new ArrayList<>() ;
		arr.add("Varsha");
		arr.add("Pooja");
		arr.add("Sama");
		str.add("Kartik");
		str.add("Nira");
		arr.addAll(0, str);
		System.out.println(arr);
		//arr.removeAll(str);
		System.out.println(arr);
		
		System.out.println(arr.size());
	Iterator<String >it=	arr.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	
}
}