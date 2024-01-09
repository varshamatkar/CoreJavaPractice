package opps;

public class Calculator {
	
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.addition(10, 10);
		c.addition(10, 10,10);

	}

}
