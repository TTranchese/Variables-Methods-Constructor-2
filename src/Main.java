public class Main {
	public static void main(String[] args) {
		//Create students, assign name to students
		Student student1=new Student("Tommaso");
		Student student2=new Student("Gigi");
		//create teacher, assign teacher's name
		Teacher  teacher1=new Teacher();
		teacher1.setTeacherName("Daniela");
		//assign grades through assignGrade method from teacher obj
		teacher1.assignGrade(student1, 10);
		teacher1.assignGrade(student2, 100);
		//print students details
		student1.getStudentsDetails();
		student2.getStudentsDetails();
	}
}