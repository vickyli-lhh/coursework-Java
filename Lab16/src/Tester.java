import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Expend wageEx = new Expend(new WageAnalyzer());
		Expend stockEx = new Expend(new StockAnalyzer());
		
		System.out.println("Please input wage expenditures:");
		int wageNum = scanner.nextInt();
		for(int i = 0; i < wageNum; i++) {
			
			String name = scanner.next();
			int wage = scanner.nextInt();
			int hour = scanner.nextInt();
			
			wageEx.add(new Wage(name, wage, hour));
		}
		
		System.out.println("Please input stock expenditures:");
		int stockNum = scanner.nextInt();
		for(int i = 0; i < stockNum; i++) {
			
			String product = scanner.next();
			int price = scanner.nextInt();
			int num = scanner.nextInt();
			
			stockEx.add(new Stock(product, price, num));
		}
		
		wageEx.getInfo();
		stockEx.getInfo();
		
		scanner.close();
	}
}
