package inheritence;

public class Instructor extends User {
	
	private String instructorNo;
	private String Course;
	
	
	public Instructor(String name, String surname, String instructorNo, String course) {
		super(name, surname);
		this.instructorNo = instructorNo;
		Course = course;
	}
	
	
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getInstructorNo() {
		return instructorNo;
	}
	
}