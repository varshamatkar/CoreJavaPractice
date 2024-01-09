package keywords;

public class ThisKeyword {
	
	
	int m=10;
	
	public ThisKeyword() {
		System.out.println("No parametarized constructor");
	}
	public ThisKeyword(int a, int c) {
		this();
		System.out.println(a/c);
		
	}
	
	public void addition(int a,int b) {
		System.out.println(a+b);
	}

	public void substraction(int a, int b) {
		this.addition(10, 20);
		System.out.println(a-b);
		
	}
	
	
	public static void main(String[] args) {
		
ThisKeyword t= new ThisKeyword(50,10);
t.substraction(20, 10);
	}

}
