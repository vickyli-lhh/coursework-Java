
public class Enroll {
	private Student student;
	private Course course;
	private int grade;
	public Enroll(Student student, Course course){
		this.student = student;
		this.course = course;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getStudentID() {
		return student.getStudentID();
	}
}
