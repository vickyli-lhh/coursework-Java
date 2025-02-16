import java.util.ArrayList;
public class EnrollList {
	private ArrayList<Enroll> enrolls = new ArrayList<>();
	private static int totalEnrollNumber = 0;
	public void addEnroll(Enroll enroll) {
		enrolls.add(enroll);
		totalEnrollNumber++;
	}
	public void giveEveryoneGrade(int grade) {
		for (Enroll enroll: enrolls) {
			enroll.setGrade(grade);
		}
	}
	public void printSummary() {
		System.out.println("Total Enroll Number: " + totalEnrollNumber);
		for(Enroll enroll: enrolls) {
			System.out.printf("Student ID: %s, Grade: %d\n", enroll.getStudentID(), enroll.getGrade());
		}
	}
}
