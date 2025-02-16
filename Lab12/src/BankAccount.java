
public class BankAccount {
	private int ID;
	private double balance;
	public BankAccount(int ID, double balance) {
		this.ID = ID;
		this.balance = balance;
	}
	public int getID() {
		return ID;
	}
	public double getBalance() {
		return balance;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setBalance( double amount) {
		this.balance = amount;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		if (this.balance >= amount ) {
			this.balance -= amount;
		}else {
			System.out.println("Your account does not have enough money.");
		}
	}
	
}
