package inheritence;

public class StudentManager {
	
	void updateGrade(Student student, int grade) {
		System.out.println("updateGrade is runing");
		
		if(grade > 100 || grade < 0 ) {
			System.out.println("Unvalid grade value");
		}
		else {
			student.setGrade(grade);
		}
		
	}

}
