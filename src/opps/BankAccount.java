package opps;

public abstract class BankAccount {
	
	
	public  void displyInfo(int bankId, String bankName) {
		System.out.println("bankId is"+ bankId);
		System.out.println("bankName is "+bankName);
	}
	
	public abstract double widrawMoney(double ammount);
	public abstract double dipositMoney(double ammount);

	

}
