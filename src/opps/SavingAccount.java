package opps;

public class SavingAccount  extends BankAccount{
	
	
	public double widrawMoney(double ammount) {
		System.out.println("Successfully widraw amount "+ammount);
		return ammount;
		
	}

	@Override
	public double dipositMoney(double ammount) {
		System.out.println("Successfully diposit amount "+ammount);
		return ammount;
	}

	public static void main(String[] args) {
	 SavingAccount s= new SavingAccount();
	 s.displyInfo(12345, "State bank of India");
	System.out.println(s.dipositMoney(10000)); 
	System.out.println( s.widrawMoney(5000));

	}

	

}
