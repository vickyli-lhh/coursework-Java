
public class SavingsAccount extends BankAccount{
	private double interestRate;
	public SavingsAccount(int amount, int ID, double interestRate) {
		super(amount, ID);
		this.interestRate = interestRate;
		
	}
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
	public void monthEnd() {
		setBalance(super.getBalance() + interestRate*1/100*super.getBalance());
	}
}
