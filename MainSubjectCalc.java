package goodSchool;
public class MainSubjectCalc implements SubjectCalc {

	@Override
	public String getCredit(int score) {
		String credit;

		if (score >= 95 && score <= 100) {
			credit = "S";
		} else if (score >= 90 && score <= 94) {
			credit = "A";
		} else if (score >= 80 && score <= 89) {
			credit = "B";
		} else if (score >= 70 && score <= 79) {
			credit = "C";
		} else if (score >= 60 && score <= 69) {
			credit = "D";
		} else {
			credit = "F";
		}
		return credit;
	}

}
