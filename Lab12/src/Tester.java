import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(102603901, 1000);
		BankAccount account2 = new BankAccount(102603902, 1500);
		BankAccount account3 = new BankAccount(102603903, 1400);
		BankAccount account4 = new BankAccount(102603904, 1800);

		Employee Alex = new Employee(109306201, "Alex", account1, "Sales Dept.", 35000, 50);
		Employee Lily = new Employee(109306203, "Lily", account2, "Sales Dept.", 27500, 8);
		Employee Tony = new Employee(109306204, "Tony", account3, "Marketing Dept.", 40000, 30);
// a. Use ArrayList named employees to store employee object
// (i.e., Alex, Lily, Tony and Bob).
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(Alex);
		employees.add(Lily);
		employees.add(Tony);
// b. Use “for-each” concept to add all employees of Sales Dept. to salesSubOrdinates ArrayList.
// And all employees in salesSubOrdinates are Bob's subordinates.
// Then create Supervisor object named Bob with following parameters
// Supervisor(110306202, "Bob", account4, "Sales Dept.", 45000, 10, salesSubOrdinates)
// and add Bob to ArrayList employees

		ArrayList<Employee> salesSubOrdinates = new ArrayList<Employee>();
		for(Employee e : employees) {
			if (e.getDepartment().equals("Sales Dept.")) {
				salesSubOrdinates.add(e);
			}
		}
		Employee Bob = new Supervisor(110306202, "Bob", account4, "Sales Dept.", 45000, 10, salesSubOrdinates);
		employees.add(Bob);

		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).monthEnd();
			System.out.println(employees.get(i).getInfo());
		}
// c. Use “for-loop” statement and call responding method (i.e., monthEnd())
// to calculate the current monthly salary of each employee
// and print the following results.
	}
}