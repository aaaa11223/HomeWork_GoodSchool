package goodSchool;
import java.util.ArrayList;

public class StudentInfo {
	private String studentName; // 학생이름
	private int studentID; // 학번
	private String mainSubject; // 중점과목
	private int koreanScore; // 국어점수
	private int mathScore; // 수학점수
	private int danceScore;	//방송댄스점수

	public StudentInfo() {

	}

	// 학생 정보 받아주는 생성자
	public StudentInfo(String studentName, int studentID, String mainSubject, int koreanScore, int mathScore) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.mainSubject = mainSubject;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
	}
	public StudentInfo(String studentName, int studentID, String mainSubject, int danceScore) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.mainSubject = mainSubject;
		this.danceScore = danceScore;
	}

	// ============== getter==================
	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}


	public String getMainSubject() {
		return mainSubject;
	}


	public int getKoreanScore() {
		return koreanScore;
	}


	public int getMathScore() {
		return mathScore;
	}

	public String getBasicSubject() {
		return basicSubject;
	}


	public SubjectCalc getBasicCredit() {
		return basicCredit;
	}

	public SubjectCalc getMainCredit() {
		return mainCredit;
	}

	public String getMathCredit() {
		return mathCredit;
	}

	public String getKoreanCredit() {
		return koreanCredit;
	}
	
	
	public int getDanceScore() {
		return danceScore;
	}

	public String getDanceCredit() {
		return danceCredit;
	}
	

	// =============================================





	// 중점 과목에 따른 전공과 일반과목 설정
	private String major;
	private String basicSubject;

	// 전공
	public String getMajor() {
		if (this.mainSubject.equals("국어")) {
			major = "국어국문학과";
		} else {
			major = "컴퓨터공학과";
		}
		return major;
	}

	// 일반과목설정, 학점계산
	// 두개를 나누는게 추후 코드 수정할때는 더 좋을듯 ?

	SubjectCalc basicCredit = new BasicSubjectCalc();
	SubjectCalc mainCredit = new MainSubjectCalc();
	SubjectCalc danceGrade = new DanceSubjectCalc();

	private String mathCredit;
	private String koreanCredit;
	private String danceCredit;

	public String getbasicSubject() {
		if (this.mainSubject.equals("국어")) {
			basicSubject = "수학";
		} else {
			basicSubject = "국어";
		}
		return basicSubject;
	}

	// 학점계산
	//     국어 학점
	public String koreanCredit() {
		if (this.mainSubject.equals("국어")) {
			koreanCredit = mainCredit.getCredit(this.koreanScore);
		} else {
			koreanCredit = basicCredit.getCredit(this.koreanScore);
		}
		return koreanCredit;
	}
	
	//      수학 학점
	public String mathCredit() {
		if (this.mainSubject.equals("수학")) {
			mathCredit = mainCredit.getCredit(this.mathScore);
		} else {
			mathCredit = basicCredit.getCredit(this.mathScore);
		}
		return mathCredit;
	}
	public String danceCredit1() {
		if (this.mainSubject.equals("방송댄스과")) {
			danceCredit = danceGrade.getCredit(this.danceScore);
		} else {
			danceCredit = danceGrade.getCredit(this.danceScore);
		}
		return danceCredit;
	}
}
