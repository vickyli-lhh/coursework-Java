import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input land's name and unit price:");
		Land land = new Land(scanner.next(), scanner.nextDouble());
		
		System.out.println("Input number of land's area: ");
		int num = scanner.nextInt();
		
		for(int i = num; i > 0; i--) {
			System.out.println("Input area:");
			String shape = scanner.next();
		
			if(shape.equals("rectangle")) {
				
				Double sideA = scanner.nextDouble();
				Double sideB = scanner.nextDouble();
				
				Rectangle newS = new Rectangle(sideA, sideB);
				land.addArea(newS);
				
			}else if(shape.equals("circle")) {
				
				Double radius = scanner.nextDouble();
				
				Circle newC = new Circle(radius);
				land.addArea(newC);
				
			}
			
		}
		land.getInfo();
		scanner.close();
	}
}

