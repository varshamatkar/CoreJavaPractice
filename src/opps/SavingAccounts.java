package opps;

public class SavingAccounts implements Bank, Account{

	
	 double balance;
	public static void main(String[] args) {
	
		SavingAccounts s= new SavingAccounts();
		s.depositMoney(1000);
		s.widrawMoney(500);
		System.out.println(s.checkBalance());

	}
	@Override
	public double checkBalance( ) {
		
		return balance;
	}

	@Override
	public void depositMoney(double ammount) {
		if(ammount>0) {
			balance=balance+ammount;
		}
		System.out.println("deposited ammountis "+ammount);
	}
	@Override
	public void widrawMoney(double ammount) {
		if(ammount>0&& ammount<balance) {
			balance=balance-ammount;
			System.out.println("widraw ammount is "+ammount);
		}
		else {
			System.out.println("insufficient fund ");
		}
	}

	@Override
	public void openAccount() {
	System.out.println("Account is open successfully");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Account is close successfully");
		
	}

}
