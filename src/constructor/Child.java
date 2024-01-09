package constructor;

public class Child extends Parent {
	
	public Child(int a) {
		super(10,15);
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		
	Child obj=new Child(10);

	}

}
