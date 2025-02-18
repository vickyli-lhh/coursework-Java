import java.util.Arrays;

public class Student {
	private int studentID;
	private String name;
	private String department;
	private int[] grades = new int[5];
	private int gradesIndex;

	public Student(int studentID, String name, String department) {
		this.studentID = studentID;
		this.name = name;
		this.department = department;

	}


	public void setStudentID(int idx) {
		this.studentID = idx;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudentID() {
		return this.studentID;
	}

	public String getName() {
		return this.name;
	}

	public String getDepartment() {
		return this.department;
	}

	public int[] getGrades() {
		return this.grades;
	}

	public int getGradesIndex() {
		return this.gradesIndex;
	}

	public int getGrade(int idx) {
		return idx;
	}

	public void addGrade(int grade) {
		if (this.gradesIndex <= 4) {
			this.grades[this.gradesIndex++] = grade;
		} else {
			System.out.println("Array index out of bounds.");
		}
	}

	public void updategrade(int idx, int grade) {
		grades[idx] = grade;
	}

	public String info() {
		String info = String.format("Student ID: %d%n", studentID) + 
					  String.format("      Name: %s%n", name) +
					  String.format("Department: %s%n", department) +
					  String.format("    Grades: %s %s %s %s %s%n", grades[0], grades[1], grades[2], grades[3], grades[4]);
		return info;
	}


}
