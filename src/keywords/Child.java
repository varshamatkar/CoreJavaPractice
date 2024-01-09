package keywords;



public class Child extends Parent{
	
	int childVaraible=10;
	
	public Child() {
		super();
		System.out.println("child class constrctor");
	}
	
	public void substraction(int a, int c) {
		super.addition(10, 10);
		System.out.println(a-c);
		System.out.println(super.superVariable);
	}
	
	
	
	public static void main(String[] args) {
		Child c= new Child();
	c.substraction(50, 30);
	}

}
