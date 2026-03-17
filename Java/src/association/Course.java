package association;

public class Course {
	private int cId;
	private String cName;
	private int totalStudents;
	
	public Course(int courseId, String courseName, int totalStudents) {
		this.cId = courseId;
		this.cName = courseName;
		this.totalStudents = totalStudents;
	}
	public String toString() {
		return "Course Details:\n"+cId+"\t"+cName+"\t"+totalStudents;
	}
}
