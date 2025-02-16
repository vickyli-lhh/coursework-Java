import java.util.ArrayList;
public class Q22 {

	public static void main(String[] args) {
		// Initialize System
		Course oop = new Course("IM001", "OOP");
		Course ds = new Course("IM002", "Data Structure");
		
		Student s1 = new Student("110356018", "Jack");
		Student s2 = new Student("110356001", "Jason");
		
		// add student to courses
		oop.enroll(s1);
		oop.enroll(s2);
		ds.enroll(s2);
		
		// Teacher of OOP is happy so give every student 100 grade
		oop.giveEveryoneGrade(100);
		
		// Teacher of Data Structure is angry so give every student 60 grade
		ds.giveEveryoneGrade(60);
		
		// End of Semester, print OOP course information
		oop.printSummary();
		
		// End of Semester, print Data Structure course information
		ds.printSummary();
	}

}
