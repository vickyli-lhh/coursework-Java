
public class StockAnalyzer implements Analyzer{
	private String name = "Stock";
	public String getAnalyzerName() {
		return this.name;
	}
	public int measureExpand(Object object) {
		Stock s = (Stock) object;
		return s.getPrice() * s.getNum();
	}
	public String getName(Object object) {
		Stock s = (Stock) object;
		return s.getProduct();
	}
}
