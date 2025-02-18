
public class Course {
	private int courseID;
	private String courseName;
	private int credits;
	private int capacity;
	private int enrolled;
	public Course(int id, String name, int credits, int capacity) {
		this.courseID = id;
		this.courseName = name;
		this.credits = credits;
		this.capacity = capacity;
		this.enrolled = 0;
	}
    public int getCourseID() { 
        return courseID; 
   } 
    public String getCourseName() { 
        return courseName; 
   }     
    public int getCredits() { 
        return credits; 
   } 
    public int getCapacity() { 
        return capacity;
    }     
    public int getEnrolled() { 
        return enrolled;
    }    
	public boolean isFull() {
		if(enrolled<capacity) {
			return false;
		}else {
			return true;
		}
	}	
	public void enroll() {
		this.enrolled += 1;
	}
	public void drop() {
		this.enrolled -= 1;		
	}
	public String getInfo() {
		String s = "";
		s = courseID + " " + courseName + " " + credits + " " + enrolled + "/" + capacity;
		return s;
	}


}
