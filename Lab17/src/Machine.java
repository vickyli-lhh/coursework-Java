
public class Machine implements FixedAsset{
	private int durableYear;
	private double residualValue;
	private double value;
	private double depreciation;
	public Machine(int durableYear, double residualValue, double value) {
		this.durableYear = durableYear;
		this.residualValue = residualValue;
		this.value = value;
	}
	public void calcDepreciation(int year) {
		if (year <= this.durableYear) {
			if (year == 1) {
				this.depreciation = 0;
			} else {
				this.depreciation  =  (this.value - this.residualValue) / this.durableYear;
			}
		} else {
			this.depreciation = 0;
		}
	}
	public double getDepreciation() {
		return this.depreciation;		
	}
	public double getValue() {
		return this.value;
	}
}
