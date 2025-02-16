import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the length of the two sides of the triangle: ");
		Scanner sideScanner = new Scanner(System.in);
		int sideA = sideScanner.nextInt();
		int sideB = sideScanner.nextInt();
		System.out.print("Please enter the angle of the triangle: ");
		Scanner angleScanner = new Scanner(System.in);
		int angleC = angleScanner.nextInt();
		double sideC = Triangle.sideC(sideA, sideB, angleC);
		double perimeter = Triangle.perimeter(sideA, sideB, sideC);
		double area = Triangle.area(sideA, sideB, sideC);
		System.out.println("The other side length is " + sideC + ".");
		System.out.println("The perimeter of the triangle is " + perimeter + ".");
		System.out.println("The area of the triangle is " + area + ".");
		sideScanner.close();
		angleScanner.close();
	}

	public static double sideC(int a, int b, int angleC) {
		double sideC = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angleC * Math.PI / 180));
		return sideC;
	}

	public static double perimeter(int sideA, int sideB, double sideC) {
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}

	public static double area(int sideA, int sideB, double sideC) {
		double area = Math.sqrt(((sideA + sideB + sideC) / 2) * ((sideA + sideB + sideC) / 2 - sideA)
				* ((sideA + sideB + sideC) / 2 - sideB) * ((sideA + sideB + sideC) / 2 - sideC));
		return area;
	}

}
