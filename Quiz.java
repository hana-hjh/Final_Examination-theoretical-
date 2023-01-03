public class Quiz
{
	private int ID;
	private Student student;
	private int totalScore;
	private int maxScore;
	
	public Quiz(int ID, Student student, int totalScore, int maxScore){
		this.ID = ID;
		this.student = student;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
	}
	
	public double grade(){
		double grade = totalScore / maxScore;
		return grade;
	}
	
}
