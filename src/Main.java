
public class Main {

	public static void main(String[] args) {
	
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setUserName("Engin");
		instructor.setPassaword("123456");
		instructor.setCourseId("Java");
		
		Student student = new Student();
		student.setId(1);
		student.setUserName("Taha");
		student.setPassaword("taha528");
		
		
		UserManager userManager = new UserManager();
		userManager.Homework(student);
		 
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(instructor);
		instructorManager.login(instructor);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student);
		studentManager.login(student);
		
		
	}

}
