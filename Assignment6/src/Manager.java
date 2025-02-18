
public class Manager extends Employee{
	private double bonusRate;
	public Manager(String name, int wage, double bonusRate) {
		super(name, wage);
		this.bonusRate = bonusRate;
	}
	public int payment() {
		return (int) (super.getWage() * super.getWorkDay() * this.bonusRate + super.getOverwork() * (int) ((super.getWage() * this.bonusRate) /8) * 1.5);
	}
}
