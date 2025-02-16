import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
ArrayList<String> namelist = new ArrayList<String>();
String existence, find_index;
int find_name;
System.out.print("Create the list with 5 names: ");
int i = 0;
while(i<5){
String str = s.next();
namelist.add(str);
i++;
}
System.out.print("The name to check existence: ");
existence = s.next();
System.out.print("The name to find index: ");
find_index = s.next();
System.out.print("The index to find name: ");
find_name = s.nextInt();
// 0.
namelist.remove(0);
// 1.
if(namelist.contains(existence)){
System.out.println("1. The list contains "+existence);
}else{
System.out.println("1. The list does not contain "+existence);
}



// 2.
System.out.printf("2. The index of %s is %s\n", find_index,
namelist.indexOf(find_index));

// 3.
System.out.printf("3. Index %s is %s\n", find_name, namelist.get(find_name));

// 4.
if(namelist.isEmpty()){
System.out.println("4. The list is empty");
}else{
System.out.println("4. The list is not empty");
}

// 5.
System.out.println("5. The size of the list is "+namelist.size());

		
		
		ArrayList<String> myList = new ArrayList<String>();
		String a = new String("HoHoHo"); 
		myList.add(0,a);
		String b = new String("Santa"); 
		myList.add(1,b); 
		System.out.print("Print myList: "); 
		for (String j : myList) {
			System.out.print(j + " ");
		}
		System.out.println();
		int theSize = myList.size(); 
		System.out.println(theSize);
		myList.remove(1); 
		boolean isIn = false; 
		for (String i1 : myList) {
			if (i1.equals(b)) {
				isIn = true;
			}
		}
		System.out.println(isIn); 
	}

}
