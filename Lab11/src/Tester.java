import java.util.ArrayList;

public class Tester {

	private static ArrayList<Employee> employees = new ArrayList<>();

	public static void main(String args[]) {
		employees.add(new SalaryEmployee("John", 2016, 45000));
		employees.add(new SalaryEmployee("Peter", 2020, 55000));
		employees.add(new HourlyEmployee("Jason", 2017, 400, 80));
		for (Employee e : employees) {
			System.out.println(presentResult(2021, e));
		}
		System.out.println();
		for (Employee e : employees) {
			System.out.println(presentResult(2022,e));
		}
	}
	public static String presentResult(int year, Employee e) {
		e.setSeniority(year - e.getOnboardYear());
		if (e instanceof SalaryEmployee) {
			((SalaryEmployee) e).setRaiseRate();
			((SalaryEmployee) e).setSalary();
//			e.setSalary();
		} else if (e instanceof HourlyEmployee) {
			((HourlyEmployee)e).setSalary();
		}
//		e.setSalary();
		return String.format("%s's salary for %d: %.0f", e.getName(), year, e.getSalary());

	}
}
