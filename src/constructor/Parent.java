package constructor;

public class Parent {
	public Parent(int a,int b) {
		System.out.println(a+b);
		
	}
	public Parent(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Parent obj= new Parent(10, 5);
		Parent obj2=new Parent(10, 20,30);
	}
	

	
}
