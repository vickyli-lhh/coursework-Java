public class Stock {
	
	private String product;
	private int price;
	private int number;
	
	public Stock(String product, int price, int number) {
		this.product = product;
		this.price = price;
		this.number = number;
	}
	
	public String getProduct() {		
		return this.product;
	}
	
	public int getPrice() {		
		return this.price;
	}
	
	public int getNum() {
		return this.number;
	}
}
