package opps;

public class Child extends Parent{
	
	
	public void car() {
		System.out.println("child havin a car");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.displyInfo("Abhi", "Deshmukh");
		c.property();
		c.car();

	}

}
