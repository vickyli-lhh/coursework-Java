import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private ArrayList<Course> enrolledCourses = new ArrayList<>();
	private int currentCredits;
	private int maxCredits;

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.studentName = name;
		currentCredits = 0;
		maxCredits = 25;
		ArrayList<Course> enrolledCourses = new ArrayList<Course>();
	}

	public Student(int studentID, String name, int maxCredits) {
		this.studentID = studentID;
		this.studentName = name;
		this.maxCredits = maxCredits;
		currentCredits = 0;
		ArrayList<Course> enrolledCourses = new ArrayList<Course>();
	}

	public Course getCourse(int id) {
		for (Course course : enrolledCourses) {
			if (course.getCourseID() == (id)) {
				return course;
			}
		}
		return null;
	}

	public void enroll(Course course) {
		if (course.isFull()) {
			System.out.println("Course " + course.getCourseID() + " is full");
			return;
		} else {

			if ((currentCredits + course.getCredits() )<= maxCredits) {
				enrolledCourses.add(course);
				course.enroll();
				currentCredits += course.getCredits();
				return;
			} else {
				System.out.println("Student " + studentID + " cannot enroll this course");
				return;
			}
		}
	}

	public void drop(int courseID) {
		Course course = this.getCourse(courseID);
		if (enrolledCourses.contains(course)) {
			enrolledCourses.remove(course);
			course.drop();
			currentCredits -= course.getCredits();
		} else {
			System.out.println("Course " + courseID + " not found in student " + studentID);
		}
	}
//		}

//	}

	public void drop(Course course) {
		int id = course.getCourseID();
		drop(id);
		return;
	}

	public String getInfo() {
		String s = "";
		s += String.format("Student ID: %d%n", studentID);
		s += String.format("Name: %s%n", studentName);
		s += String.format("Credits: %d/%d%n", currentCredits, maxCredits);
		s += String.format("Course list:%n");
//		s += (course.getInfo());
		for (Course course : enrolledCourses) {
			s += course.getCourseID() + " " + course.getCourseName() + " " + course.getCredits() + "\n";
		}
		return s;

	}

}
