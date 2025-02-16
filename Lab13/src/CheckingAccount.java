
public class CheckingAccount extends BankAccount{
	private int transCount;
	public CheckingAccount(double amount, int ID) {
		super(amount, ID);
	}
	public void deposit(double amount) {
		transCount++;
		super.deposit(amount);
	}
	public void withdraw(double amount) {
		transCount++;
		super.withdraw(amount);
	}
	public void monthEnd() {
		double commissionFee = 5;
		if (transCount >3){
			setBalance(super.getBalance() - commissionFee);
		}
		transCount = 0;
	}

}
