import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input company employees information");
		Company company = new Company(scanner.next()); // name of company
		int num_employee = scanner.nextInt(); // number of employee

		for(int i=0; i<num_employee; i++) {
			
			String title = scanner.next();
			String name = scanner.next();
			int wage = scanner.nextInt();
			
			if(title.equals("staff")) {
				
				company.addE(new Employee(name, wage));
				
			}else if(title.equals("manager")){
				
				double bonusRate = scanner.nextDouble();
				company.addE(new Manager(name, wage, bonusRate));
			}
			
			
		}
		
		System.out.println("Input employees working data");
		int num_input = scanner.nextInt(); // number of working data
		
		for(int i=0; i<num_input; i++) {
			
			String name = scanner.next();
			int time = scanner.nextInt();			
			company.addWork(name, time);
		}
		
		Analyzer wageA = new WageAnalyzer();
		Analyzer overA = new OvertimeAnalyzer();
		
		company.getInfo();
		company.callA(wageA);
		company.callA(overA);
		
		scanner.close();
		
	}
}
