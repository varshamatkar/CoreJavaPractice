package collection;

import java.util.Iterator;

public class Vector {

	public static void main(String[] args) {
		java.util.Vector<String>v= new java.util.Vector<>();
		v.add("Varsha");
		v.add("matkar");
		System.out.println(v);
		
	Iterator<String >it=	v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
