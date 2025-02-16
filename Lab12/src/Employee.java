
public class Employee {
	private int ID;
	private double baseSalary;
	private double totalSalary;
	private int sales;
	private String name;
	private String department;
	private BankAccount account;

	public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
		this.ID = ID;
		this.baseSalary = baseSalary;
		this.totalSalary = 0;
		this.sales = sales;
		this.name = name;
		this.department = department;
		this.account = account;
	}

	public String getDepartment() {
		return department;
	}

	public int getSales() {
		return sales;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public void monthEnd() {
		double taxRate = 0.03;
		int salesBonus = 500;
		this.totalSalary = (this.baseSalary + (this.sales * salesBonus)) * (1.0 - taxRate);
		this.account.deposit(this.totalSalary);
	}

	public String getInfo() {
		String s = "";
		s += String.format("ID:%-8d%n", ID);
		s += String.format("Name:%-30s%n", name);
		s += String.format("Department:%-20s%n.", department);
		s += String.format("Total sales:%-30d%n", sales);
		s += String.format("Total salary:%-30.0f%n", totalSalary);
		return s;
	}

}
