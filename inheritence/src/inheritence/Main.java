package inheritence;

public class Main {

	
	public static void main(String[] args) {
		Student student1 = new Student("engin","demirog","2222","java",87);
		System.out.println(student1.getName());
		
		Instructor instructor1 = new Instructor("enginhoca","demiroghoca","01245","Java,C#");
		System.out.println(instructor1.getName());
		
		System.out.println("----------------------------------------------------------------------");
		
		
		UserManager userManager = new UserManager();
		System.out.println(student1.getName());
		userManager.nameUpdate(student1,"EnginOgrenci","DemirogOgrenci");
		System.out.println(student1.getName());
		
		System.out.println("----------------------------------------------------------------------");
		
		
		
		System.out.println(instructor1.getCourse());
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1, ",react");
		System.out.println(instructor1.getCourse());
		
		System.out.println("----------------------------------------------------------------------");
		
		
		StudentManager studentManager = new StudentManager();
		System.out.println(student1.getGrade());
		
		studentManager.updateGrade(student1, 143);
		
		studentManager.updateGrade(student1, 95);
		System.out.println(student1.getGrade());
		
	}

}

