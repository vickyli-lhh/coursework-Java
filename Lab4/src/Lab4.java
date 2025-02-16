import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		
		int layer = 1;
		System.out.print("Please input the layer: ");
		Scanner layerScanner = new Scanner(System.in);
		layer = layerScanner.nextInt();
		for (int i = 0; i < layer; i++) {
			for (int space = 0; space < layer - i - 1; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2 * i + 1; star++) {
				System.out.print("*");
			}
			System.out.println();

}
		System.out.print("Input numbers: ");
		Scanner Scanner = new Scanner(System.in);	
		int num = 0;
		int odd_result = 0;
		int even_result = 0;
		while(Scanner.hasNextInt()) {
			num = Scanner.nextInt();
			if(num%2 == 0) {
				even_result += num;}
			else {
				odd_result += num;}
			}
		System.out.println("Odd sum: " + odd_result);
		System.out.print("Even sum: " + even_result);
	}
}