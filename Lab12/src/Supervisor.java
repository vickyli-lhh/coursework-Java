import java.util.ArrayList;
public class Supervisor extends Employee{
	private ArrayList <Employee> subordinates = new ArrayList<Employee>();
	public Supervisor(int ID, String name, BankAccount account, String department, int baseSalary, int sales,
			ArrayList<Employee> subordinates) {
		super(ID, name, account, department, baseSalary, sales);
		this.subordinates = subordinates;
		int subordinatesSales = 0;
		for(Employee e: subordinates) {
			subordinatesSales += e.getSales();
		}
		this.setSales(sales += subordinatesSales);
	}
}
