import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tester {


	File newObj = new File("salesData.txt");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit("apple", 10, 15);
		Fruit banana = new Fruit("banana", 5, 10);
		Fruit orange = new Fruit("orange", 20, 35);
		Shop shop = new Shop();
		File newObj = new File("salesData.txt");
		Scanner reader = null;
		try {
			reader = new Scanner(newObj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader.nextLine();
		while (reader.hasNextLine()) {
			int applenum = reader.nextInt();
			int banananum = reader.nextInt();
			int orangenum = reader.nextInt();
			shop.addOrder(apple, applenum);
			shop.addOrder(banana, banananum);
			shop.addOrder(orange, orangenum);
			
		}
		String report;
		report = shop.getReport();
		
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("shop_report.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			myWriter.write(report);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(report);
		System.out.println("Report has been written to your_file_name.txt");
		
		reader.close();
		}
		
	}


