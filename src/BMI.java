import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight,height;
		System.out.print("Please input the weight(kg): ");
		Scanner Scanner = new Scanner(System.in);
		weight = Scanner.nextInt();
		System.out.print("Please input the height(cm): ");
		height = Scanner.nextInt();
		float meterheight = (float) height / 100;
		System.out.println("Process: " + (weight + "/(" + meterheight + "*" + meterheight +")"));
		float result = weight/(meterheight*meterheight);
		System.out.print("Your BMI is: ");
		System.out.printf("%6.2f", result);
		System.out.println();
		String comment;
		if(result<18.5) {
			comment = "underweight";}
			else if(result>24.0) {
			comment = "overweight";}
		    else {
			comment = "normal";}
		System.out.print("The result is: " + comment);
	}
}


