package goodSchool;
public class DanceSubjectCalc implements SubjectCalc{

	@Override
	public String getGrade(int score) {
		String grade;

		if (score >= 70 ) {
			grade = "PASS";
		} else {
			grade = "FAIL";
		}
		return grade;
		
	}

}
