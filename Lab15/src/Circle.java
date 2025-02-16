
public class Circle implements Shape{
	private double pi = 3.14;
	private double radius;
	private double area;
	public Circle(double radius) {
		this.radius = radius;
	}
	public void calcArea() {
		this.area = this.radius*this.radius*this.pi;
	}
	public double getArea() {
		this.area = this.radius*this.radius*this.pi;
		return this.area;
	}
}
