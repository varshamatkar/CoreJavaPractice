package constructor;

class Parameterized {
	
	public Parameterized(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	
	public Parameterized(int a, int b, int c) {
		this(9,10);
		System.out.println(a+b+c);
	}
	
	public Parameterized(String str) {
		this(10,50,100);
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		Parameterized obj= new Parameterized(5, 10);
		Parameterized obj2=new Parameterized(10, 5,15);
		Parameterized obj3= new Parameterized("Varsha Matkar");
	}
	

}
