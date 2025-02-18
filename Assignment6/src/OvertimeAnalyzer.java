import java.util.ArrayList;
class OvertimeAnalyzer implements Analyzer{
	private int count = 0;
	private int sum = 0;	
	private double avg = 0.0;
	private int max = 0;
	
	public void addE(ArrayList<Employee> employees) {
		for (Employee e : employees) {
			if (e.getOverwork() > 0) {
				this.count += 1;
				int ow = e.getOverwork();
				this.sum += ow;
				if (this.max < ow) {
					this.max = ow;
				}
			}
		}
		this.avg = (double) this.sum / this.count;	
	}
	public void getInfo() {
		System.out.printf("%-20s%n","<Over Work Info>");
		System.out.printf("%20s%10d%n", "Employees:", this.count);
		System.out.printf("%20s%10d%n", "Total hours:", this.sum);
		System.out.printf("%20s%10.2f%n", "Average hours:", this.avg);
		System.out.printf("%20s%10d%n", "Max hours:", this.max);
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
