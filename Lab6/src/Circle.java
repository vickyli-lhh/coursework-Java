import java.lang.Math;
import java.util.Scanner;

public class Circle {

	private int radius, x, y;
	private double area, circumference;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

	
	
	public double area() {
		return radius * radius * Math.PI;
	}

	public double circumference() {
		return radius * 2 * Math.PI;
	}

	public String rangePoint(int x, int y) {
		double d;
		String s = "";
		d = Math.sqrt((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()));
		if (d < radius) {
			s = ("the point inside the circle.");
		} else if (d == radius) {
			s = ("the point on the circle.");
		} else if (d > radius) {
			s = ("the point outside the circle.");
		}
		return s;
	}

	public String rangeCircle(int x, int y) {
		double d;

		d = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
		String s = "";
		if (d < Math.abs(radius - this.getRadius())) {
			s = ("the centre of one circle lies on the other circle");
		} else if (d == Math.abs(radius - this.getRadius())) {
			s = ("two circles are concentric.");
		} else if (Math.abs(radius - this.getRadius()) < d && d < radius + this.getRadius()) {
			s = ("two circles intersect at two points.");
		} else if (d == radius + this.getRadius()) {
			s = ("the circles touch externally.");
		} else if (d > radius + this.getRadius()) {
			s = ("the circles do not touch or intersect each other.");
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Please input the radius of the circle1: ");
		int radius = inputScanner.nextInt();
		System.out.print("Please enter xy-coordinate of center for the circle1 (separated by spaces): ");
		int circle_x = inputScanner.nextInt();
		int circle_y = inputScanner.nextInt();
		System.out.print("Please enter the xy-coordinate of the point: ");
		int point_x = inputScanner.nextInt();
		int point_y = inputScanner.nextInt();
		Circle circle1 = new Circle(circle_x, circle_y, radius);
		Circle circle2 = new Circle(0, 0, 5);
		circle1.area();
		circle1.circumference();
		circle1.rangePoint(point_x, point_y);
		System.out.println("The area of the circle1 is " + Math.round(circle1.area()*1.00/1.00));
		System.out
				.println("The circumference of the circle1 is " + Math.round(circle1.circumference() * 100.0) / 100.0);
		System.out.println("The relationship between point and circle:" + circle1.rangePoint(point_x, point_y));
		System.out.println("The relationship between the two circles:" + circle1.rangeCircle(circle2.getX(), circle2.getY()));
	}

}
