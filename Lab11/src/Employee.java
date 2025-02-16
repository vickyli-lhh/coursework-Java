
public class Employee {
	private String name;
	private int onboardYear;
	private int seniority;
	private double salary;
//	protected double currentSalary;
	public Employee(String name, int onboardYear) {
		this.name = name;
		this.onboardYear = onboardYear;
	}
	public String getName(){
		return name;
	}
	public int getSeniority() {
		return seniority;
	}
	public int getOnboardYear() {
		return onboardYear;
	}
	public double getSalary() {
		return salary;
	}
	public void setSeniority(int newSeniority) {
		this.seniority = newSeniority;
	}
	public void setSalary(double salary) {
		this.salary = salary;
//		currSalary = salary;
	}
//	public void setSalary() {
//		// TODO Auto-generated method stub
//		double salary = this.salary;
////		currentSalary = salary;
//	}
}
