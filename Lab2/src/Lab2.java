import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner numScanner = new Scanner(System.in);
		System.out.print("Please input two numbers(use space to split):");
		num1=numScanner.nextInt();
		num2=numScanner.nextInt();
		System.out.println("Gap: " + Math.abs(num1-num2));
		System.out.println("Mul: " + num1*num2);
		System.out.println("Avg: " + (num1+num2) / 2.0);
		System.out.println("Min: " + Math.min(num1, num2));//1-A
		
		int gap=Math.abs(num1-num2);
		int min=Math.min(num1, num2);
		double randomnum=Math.random();
		int casting=(int)((gap*randomnum) + min);
		
		System.out.println("Random number between " + num1 + " and " + num2 + ": "+casting);//1-B
		String fullName="Vicky Li";
		System.out.println(fullName);
		System.out.println("My first name: " + fullName.substring(0,5) + " - " + fullName.substring(0,5).length());
		System.out.println("My last name: " + fullName.substring(6,8) + " - " + fullName.substring(6,8).length());//2
		
		
				
	}
	
}
