
public class Rectangle implements Shape{
	private double length;
	private double width;
	private double area;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void calcArea() {
		this.area = this.length*this.width;
	}
	public double getArea() {
		calcArea();
		return this.area;
		
	}
}
