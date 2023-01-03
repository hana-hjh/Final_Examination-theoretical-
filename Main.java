import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Student student = new Student("Hannah","BSCS");
		Quiz quiz = new Quiz(15-00017, student, 100, 4);
		
		System.out.println("Student Grade: " + quiz.grade());
	}
}
