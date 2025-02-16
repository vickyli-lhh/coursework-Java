
public class BankCard extends Card{
	private int expYear;
	public BankCard(String name, int year) {
		super(name);
		this.expYear = year;
	}
	public void replace(int year) {
		if (year <= this.expYear) {
			System.out.println("Your card has not expired.");
		}else{
			this.expYear = year + 1 ;
		}
	}
	public void getInfo() {
		System.out.println("<BANK CARD INFO>");
		System.out.println("Name: " + super.getName());
		System.out.println("Expire year: " + this.expYear);
		System.out.println();
	}

}
