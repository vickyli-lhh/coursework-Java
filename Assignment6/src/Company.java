import java.util.ArrayList;
import java.lang.Math;
public class Company {
	private String name;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public Company(String name) {
		this.name = name;
	}

	public void addE(Employee employee) {
		employees.add(employee);
	}

	public void addWork(String name, int hour) {
		
		for (int i = 0; i < employees.size(); i++) {
			String eName = employees.get(i).getName();
			if (name.equals(eName)) {
				employees.get(i).addworkDay();
				if (hour > 8) {
					employees.get(i).addoverWork(hour - 8);
				}
			}
		}
	}

	public void callA(Analyzer analyzer) {
		analyzer.addE(employees);
		analyzer.getInfo();
	}

	public void getInfo() {
		System.out.println("<Company: " + name +  ">");
		System.out.printf("%10s%10s%10s%10s%10s%n", "Name", "WorkDay", "OverTime", "Wage", "Title" );
		for (int i = 0; i < employees.size(); i++ ) {
			String title = "staff";
			if (employees.get(i) instanceof Manager) {
				title = "manager";
			}
				System.out.printf("%10s%10s%10s%10s%10s%n", employees.get(i).getName(), employees.get(i).getWorkDay(), employees.get(i).getOverwork(), Math.round(Math.floor(employees.get(i).payment())), title );
			}
	}
}
