package inheritence;

public class Student extends User{
	
	private String studentNum; 
	private String Courses;
	
	int Grade;
	
	
	public Student(String name, String surname, String studentNum, String courses, int grade) {
		super(name, surname);
		this.studentNum = studentNum;
		Courses = courses;
		Grade = grade;
	}


	public int getGrade() {
		return Grade;
	}


	public void setGrade(int grade) {
		Grade = grade;
	}
	
	
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
}
