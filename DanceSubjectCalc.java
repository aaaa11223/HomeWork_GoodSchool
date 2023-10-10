package goodSchool;
public class DanceSubjectCalc implements SubjectCalc{

	@Override
	public String getCredit(int score) {
		String credit;

		if (score >= 70 ) {
			credit = "PASS";
		} else {
			credit = "FAIL";
		}
		return credit;
		
	}

}
