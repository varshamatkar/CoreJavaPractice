package constructor;

public class NoArgumentConstructor {

	int a;
	int b;
	public NoArgumentConstructor() {
		System.out.println("No argument constructor");
	}
	
	public static void main(String[] args) {
		NoArgumentConstructor obj= new NoArgumentConstructor();
		System.out.println(obj.a);
		
	}
}
