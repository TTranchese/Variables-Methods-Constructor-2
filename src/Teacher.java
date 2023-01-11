public class Teacher {
	private String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Teacher(){
		System.out.println("A new teacher has been created");
	}

	public void assignGrade(Student  alum, int finalGrade){
		alum.setGrade(finalGrade);
	}
}
