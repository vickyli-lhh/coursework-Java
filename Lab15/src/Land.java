
public class Land {
	private String name;
	private double unitPrice;
	private double totalArea;
	private double totalPrice;
	public Land(String name, double unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;
	}
	public double tp() {
		this.totalPrice = this.totalArea* this.unitPrice;
		return this.totalPrice;
	}
	public void addArea(Shape shape) {
		this.totalArea += shape.getArea();
	}
	public void getInfo() {
		System.out.println("Land: " + name);
		System.out.println("Total area = " + Math.round(this.totalArea*100.0)/100.0);
		System.out.println("Total Price = " + Math.round(tp()*100.0)/100.0);
	}
}
