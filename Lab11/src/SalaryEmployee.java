
public class SalaryEmployee extends Employee {
	private double avgSalary;
	private double raiseRate;
	public SalaryEmployee(String name, int onboardYear, double avgSalary) {
		super( name, onboardYear) ;
		this. avgSalary =  avgSalary;
	}

	public void setSalary() {
		super.setSalary(this.raiseRate*this.avgSalary);
//		currSalary = salary;
	}
	public void setRaiseRate() {
		this.raiseRate = (1+super.getSeniority()/100.0);
//		currentSalary = salary;
	}
}
