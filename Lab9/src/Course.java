
public class Course {
	private String courseID;
	private String name;
	private EnrollList enrolls;

	public Course(String courseID, String name) {
		this.courseID = courseID;
		this.name = name;
		this.enrolls = new EnrollList();
	}

	public void enroll(Student student) {
		Enroll enroll = new Enroll(student, this);
		enrolls.addEnroll(enroll);
	}
    public void giveEveryoneGrade(int grade) {
		enrolls.giveEveryoneGrade(grade);
	}

	public void printSummary() {
		System.out.println("Course: " + name);
		enrolls.printSummary();
		System.out.println("-".repeat(40));
	}
}
