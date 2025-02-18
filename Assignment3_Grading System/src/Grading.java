
public class Grading {
	private int passMark;

	public Grading(int passMark) {
		this.passMark = passMark;
	}

	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}

	public int getPassMark() {
		return passMark;
	}

	public String toLetterGrade(int score) {
		String letterGrades = "";
		if (100 >= score && score >= 80) {
			letterGrades = "A";
		} else if (79 >= score && score >= 70) {
			letterGrades = "B";
		} else if (69 >= score && score >= 60) {
			letterGrades = "C";
		} else if (59 >= score && score >= 50) {
			letterGrades = "D";
		} else if (49 >= score && score >= 1) {
			letterGrades = "E";
		} else if (score == 0){
			letterGrades = "X";
		}
		return letterGrades;
	}

	public double calculateAvg(int[] grades) {
		double avg = 0;
		double sum = 0;
		if (grades.length > 0) {
			for (int grade : grades) {
				sum += grade;
			}
			avg = (sum / grades.length);
		}
		return avg;
	}

	public String summerizeGrade(int[] grades) {
		int pass = 0;
		int fail = 0;
		String string = "";
		
		for (int grade:grades) {
			
		string += toLetterGrade(grade) + " ";
			if (grade >= passMark) {
				pass += 1;
			} else {
				fail += 1;
			}
		}
	
		String sumG = ("Avg. Score: ") + (calculateAvg(grades) + String.format("\nPass: %d, Failed: %d\n" , pass, fail)) + ("All Grades Letter: " + string);
		return sumG;
	}

}
