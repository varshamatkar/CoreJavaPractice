package wrapperClasses;

public class WrapperClassesEx {

	public static void main(String[] args) {
		
		int a=10;
		// convert primitive to wrapper object
		Integer i= Integer.valueOf(a);
		System.out.println(i);
		
		
		// wrapper object primitive 
		Character c= Character.valueOf('C');
		System.out.println(c.charValue());
		
		
		// convert string to primitive
		String date="28";
		
		int d= Integer.parseInt(date);
		System.out.println(d);
		
		// primitive to string
		int f=10;
		String str= Integer.toString(f);
		

	}

}
