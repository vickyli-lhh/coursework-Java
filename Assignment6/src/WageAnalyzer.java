import java.util.ArrayList;
class WageAnalyzer implements Analyzer{
	private int count = 0;
	private int sum = 0;	
	private double avg = 0.0;
	private int max = 0;
	
	public void addE(ArrayList<Employee> employees) {
		this.count = employees.size();
		for (Employee e : employees) {
			int paymant = e.payment();
			this.sum += paymant ;
			if (this.max < paymant) {
				this.max = paymant;
			}
		}
		this.avg = (double) this.sum / this.count;	
	}
	public void getInfo() {
		System.out.printf("%-20s%n","<Wage Info>");
		System.out.printf("%20s%10d%n", "Employees:", this.count);
		System.out.printf("%20s%10d%n", "Total payment:", this.sum);
		System.out.printf("%20s%10.2f%n", "Average payment:", this.avg);
		System.out.printf("%20s%10d%n", "Max payment:", this.max);
	}
	public int count() {
		return this.count;
	}
	public int sum() {
		return this.sum;
	}
	public double avg() {
		return this.avg;
	}
	public int max() {
		return this.max;
	}	
}
