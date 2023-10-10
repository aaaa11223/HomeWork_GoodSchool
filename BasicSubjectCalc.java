package goodSchool;
public class BasicSubjectCalc implements SubjectCalc {

	@Override
	public String getCredit(int score) {
		String credit;

		if (score >= 90 && score <= 100) {
			credit = "A";
		} else if (score >= 80 && score <= 89) {
			credit = "B";
		} else if (score >= 70 && score <= 79) {
			credit = "C";
		} else if (score >= 55 && score <= 69) {
			credit = "D";
		} else {
			credit = "F";
		}
		return credit;
		
	}

}
