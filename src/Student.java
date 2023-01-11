public class Student {
	private String name;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(String name){
		System.out.println("A new student has been created");
		this.name=name;
	}

	public void getStudentsDetails(){
		System.out.println("Student: "+name);
		System.out.println("Grade: "+grade);
	}
}
