
public class Program {

	public static void main(String[] args) {

		double[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
	
		GradeBook gradeBook = new GradeBook("COMP228-Java Programming", gradesArray);
		gradeBook.processGrades();
	}

}
