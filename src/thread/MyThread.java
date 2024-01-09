package thread;

public class MyThread  {
	
	

	public static void main(String[] args) {
		EvenNumberThread e= new EvenNumberThread();
		e.start();
		OddNumber o= new OddNumber();
		o.start();
	}
	
		
	}
