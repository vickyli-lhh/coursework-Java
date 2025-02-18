
public class Employee {
	private String name;
	private int wage;
	private int workDay;
	private int overWork;
	public Employee(String name, int wage) {
		this.name = name;
		this.wage = wage;
		this.workDay = 0;
		this.overWork = 0;
	}
	public int payment() {
		return this.wage * this.workDay + (int) ((this.overWork * (int) (this.wage/8)) * 1.5);
	} 
	public String getName() {
		return this.name;
	}
	public int getWage() {
		return this.wage;
	}
	public int getWorkDay() {
		return this.workDay;
	}
	public int getOverwork() {
		return this.overWork;
	}
	public void addworkDay() {
		this.workDay++;
	}
	public void addoverWork(int overWork) {
		this.overWork+=overWork;
	}
}
