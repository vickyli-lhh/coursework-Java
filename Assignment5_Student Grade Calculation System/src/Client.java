public class Client {
	public static void main(String[] args) {
// IMStudent Constructor: (String name, int mis, int oop, int accounting, int economics)
// define a variable ims1 which type is MISStudent and store an instance of IMStudent
// your code here...
		IMStudent ims1 = new IMStudent("Jack", 80, 90, 90, 100) ;
// ITStudent Constructor: (String name, int mis, int oop, int ds, int db)
// define a variable its1 which type is MISStudent and store an instance of ITStudent
// your code here...
		ITStudent its1 = new ITStudent("Jason", 90, 100, 68, 97) ;
		System.out.printf("%s's grade: %.2f\n", ims1.getName(), ((MISStudent) ims1).getGrade());
		System.out.printf("%s's grade: %.2f\n", its1.getName(), ((MISStudent) its1).getGrade());
	}
}
