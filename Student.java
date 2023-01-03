
import org.apache.http.conn.util.*;public class Student
{
	private String name;
	private String course;
	
	public Student(String name, String course){
		this.name = name;
		this.course = course;
	}
	
	void setName(String studentName){
		name = studentName;
	}
	
	String getName(){
		return name;
	}
	
	void setCourse(String studentCourse){
		course = studentCourse;
	}
	
	String getCourse(){
		return course;
	}
}
