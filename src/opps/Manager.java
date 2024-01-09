package opps;

public class Manager extends Employee{
	 double bonus;
	 
	 
	 
		public double calculateSalary(double bonus) {
		 return 50000+bonus;
		 
	 }

	
	public static void main(String[] args) {
	Manager m =new Manager();
	m.displyInfo(5, "Avinash");
	System.out.println("Salary of manager is "+m.calculateSalary(10000));
	
	
	
		
		
	}

}
