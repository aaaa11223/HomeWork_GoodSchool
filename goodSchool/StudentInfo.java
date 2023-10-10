package goodSchool;
import java.util.ArrayList;
import java.util.List;

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


	public SubjectCalc getBasicGrade() {
		return basicGrade;
	}

	public SubjectCalc getMainGrade() {
		return mainGrade;
	}

	public String getMathGrade() {
		return mathGrade;
	}

	public String getKoreanGrade() {
		return koreanGrade;
	}
	
	public int getDanceScore() {
		return danceScore;
		
	}

	public String getDanceGrade() {
		return danceGrade;
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


	SubjectCalc basicGrade = new BasicSubjectCalc();
	SubjectCalc mainGrade = new MainSubjectCalc();
	SubjectCalc danceSubjectGrade = new DanceSubjectCalc();

	private String mathGrade;
	private String koreanGrade;
	private String danceGrade;

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
	public String koreanGrade() {
		if (this.mainSubject.equals("국어")) {
			koreanGrade = mainGrade.getGrade(this.koreanScore);
		} else {
			koreanGrade = basicGrade.getGrade(this.koreanScore);
		}
		return koreanGrade;
	}
	
	//      수학 학점
	public String mathGrade() {
		if (this.mainSubject.equals("수학")) {
			mathGrade = mainGrade.getGrade(this.mathScore);
		} else {
			mathGrade = basicGrade.getGrade(this.mathScore);
		}
		return mathGrade;
	}
	public String danceGrade1() {
		if (this.mainSubject.equals("방송댄스과")) {
			danceGrade = danceSubjectGrade.getGrade(this.danceScore);
		} else {
			danceGrade = danceSubjectGrade.getGrade(this.danceScore);
		}
		return danceGrade;
	}
}
