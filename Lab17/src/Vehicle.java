
public class Vehicle implements FixedAsset{
	private int durableYear;
	private double residualValue;
	private double value;
	private double depreciation;
	private double deRate;
	public Vehicle(int durableYear, double residualValue, double value) {
		this.durableYear = durableYear;
		this.residualValue = residualValue;
		this.value = value;
		this.deRate = (1.0 / this.durableYear) * 2;
	}
	public void calcDepreciationRate() {
		this.deRate = (1.0 / this.durableYear) * 2;
	}
	public void calcDepreciation(int year) {
		if (year ==  this.durableYear){
			this.depreciation  =  (this.value - this.residualValue) / (double) this.durableYear;
		} else if (year == 1) {
			this.depreciation = 0;
		} else if (year < this.durableYear ){
			this.depreciation = this.residualValue * this.deRate;
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
