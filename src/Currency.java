import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Convert from TWD, EUR, KRW: ");
		Scanner cyScanner = new Scanner(System.in);
		String currency = cyScanner.nextLine();
		System.out.print("Value: ");
		int value = cyScanner.nextInt();
		double dvalue = (double)value;
		if (currency.equals("TWD")) {
			System.out.printf("The result: %.2f%7s%.2f%7s%.2f%4s",dvalue," TWD = ",(double)value*0.031," EUR = ",(double)value*42.63," KRW");}
			else if (currency.equals("EUR")) {
				System.out.printf("The result: %.2f%7s%.2f%7s%.2f%4s",dvalue," EUR = ",(double)value/0.031," TWD = ",(double)value*42.63/0.031," KRW");}
			else {
				System.out.printf("The result: %.2f%7s%.2f%7s%.2f%4s",dvalue," KRW = ",(double)value/42.63," TWD = ",(double)value*0.031/42.63," EUR");}
	}


	}


