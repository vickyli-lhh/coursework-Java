import java.util.ArrayList;
public class Company {
	private String name;
	private int year = 1;
	private double bookValue = 0;
	private ArrayList<FixedAsset> assets = new ArrayList<FixedAsset>();
	public Company(String name) {
		this.name = name;
	}
	public void addFixedAsset(FixedAsset asset) {
		this.assets.add(asset);
		this.bookValue += asset.getValue();
	}
	public String getName() {
		return this.name;
	}
	public int getYear() {
		return this.year;
	}
	public double getBookValue() {
		return Math.round(this.bookValue*100.0)/100.0;
	}
	public double getDepreciation() {
		double depreciation = 0;
		for (FixedAsset asset : assets) {
			depreciation += asset.getDepreciation();
		}
		return Math.round(depreciation*100.0)/100.0;
	}
	public int addYear() {
		this.year++;
		for (FixedAsset asset : assets) {
			asset.calcDepreciation(this.year);
		}
		for (FixedAsset asset : assets) {
			this.bookValue -= asset.getDepreciation();
		}
		return this.year;
	}
	public int minusYear() {
		if (this.year > 1) {
			for (FixedAsset asset : assets) {
				asset.calcDepreciation(this.year);
			}
			for (FixedAsset asset : assets) {
				this.bookValue += asset.getDepreciation();
			}
			this.year--;
		}
		return this.year;
	}
}
