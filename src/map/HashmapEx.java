package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashmapEx {
	
	public static void main(String[] args) {
		
		HashMap<String, String>h= new HashMap<>();
		h.put("1", "Varsha");
		h.put("2", "Matkar");
		h.put("3", "Akash");
		h.put(null, null);
		h.put("4", null);
		//System.out.println(h);
		
//		System.out.println(h.containsKey("1"));
//		System.out.println(h.containsValue("Matkar"));
		h.remove("1");
	
		//System.out.println(h);
		h.replace("2", "Dhanapune");
	//	System.out.println(h);
		
		Hashtable<String, String>h2= new Hashtable<>();
		h2.put("1", "Varsha");
		h2.put("2", "Matkar");
		h2.put("3", "Akash");
		
		//System.out.println(h2);
		
	LinkedHashMap< String, String>h3= new LinkedHashMap<>();
	h3.put("1", "Varsha");
	h3.put("2", "Matkar");
	h3.put("3", "Akash");
	h3.put(null, null);
	h3.put(null, null);
	//System.out.println(h3);
	
	TreeMap<String,String >t= new TreeMap<>();
	t.put("1", "Varsha");
	t.put("2", "Matkar");
	t.put("3", "Akash");
	t.put("4", null);
	
	System.out.println(t);
	}

}
