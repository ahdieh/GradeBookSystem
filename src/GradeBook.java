
public class GradeBook {
	
	//PRIVATE VARIABLES ++++++++++++++++++++++++
		private String _courseName;
		private double[] _grades;
		
		// CONSTRUCTOR ++++++++++++++++++++++++++++++
		public GradeBook(String courseName, double[] grades){
			this._courseName = courseName;
			this._grades = grades;
			
		}

		// PROPERTIES +++++++++++++++++++++
		public String getCourseName() {
			return this._courseName;
		}

		public void setCourseName(String courseName) {
			this._courseName = courseName;
		}
		
	//PUBLIC METHODS +++++++++++++++++++++++++++++++++++++
		
		public void outputGrades(){
			System.out.println("The Grades are:");
			
			for (double grade : this._grades){
				System.out.printf("%s%n", grade);
			}
		}
		
	 public double getAverage(){
		    double total = 0;
	     for(double grade : this._grades){
		        total+=grade;
	     }
	     return total/this._grades.length;
	 }
		
	 public double getMax(){
	 	double maxGrade = this._grades[0];
	 	for(double grade : this._grades){
	 		if (grade>maxGrade)
	 			maxGrade = 	grade;
	 	}
	 	return maxGrade;
	 }
	 
	 public double getMin(){
	 	double minGrade = this._grades[0];
	 	for(double grade : this._grades){
	 		if (grade<minGrade)
	 			minGrade = 	grade;
	 	}
	 	return minGrade;
	 }
	 
	 public void processGrades(){
	 	outputGrades();
	 	System.out.printf("%nClass average is %s: ",getAverage());
	 	System.out.printf("%nThe lowest grade is: %.2f and the highest grade is: %.2f.",getMin(), getMax());
	     outputBarChart();
	 }
	 
	 public void outputBarChart(){
	 	int[] frequency = new int[11];
	 	for(double grade : this._grades){
	 		frequency[(int) (grade/10)]++;
	 	}
	 	System.out.printf("%n%nGrade distribution:");

	 		for (int j = 0; j<frequency.length;j++){
	 	    	if (j==10)
	 	    		System.out.printf("%n%5d: ", 100);
	 	    	
	 	    	else
	 			System.out.printf("%n%02d-%02d: ",j*10, j*10+9);
	 
	 	    	for (int stars = 0; stars<frequency[j]; stars++){
	 	    		System.out.print("*");
	 	    		
	     		}
	 		}
	 		
	 		
	 		
	 }
}
