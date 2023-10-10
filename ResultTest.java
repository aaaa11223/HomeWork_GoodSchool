package goodSchool;

import java.util.ArrayList;
import java.util.List;

public class ResultTest {
	
	public static void korean() {
		
	}

	public static void main(String[] args) {

		
		// 위쪽 목록 삽입
		ResultScreen screen= new ResultScreen();

		StudentInfo st1 = new StudentInfo("안성원", 181213, "국어", 95, 56);
		StudentInfo st2 = new StudentInfo("오태훈", 182330, "수학", 95, 98);
		StudentInfo st3 = new StudentInfo("이동호", 171518, "국어", 100, 88);
		StudentInfo st4 = new StudentInfo("조성욱", 172350, "국어", 89, 95);
		StudentInfo st5 = new StudentInfo("최태평", 171290, "수학", 83, 56);
		
		StudentInfo st7 = new StudentInfo("안성원", 181213, "국어", 80);
		StudentInfo st8 = new StudentInfo("오태훈", 182330, "수학", 70);
		StudentInfo st9 = new StudentInfo("이동호", 171518, "국어", 60);
		

		
		
		// 필수과목 일반과목 나누기, 학점계산
		StudentInfo[] students = { st1, st2, st3, st4, st5 };
		StudentInfo[] students2 = { st7, st8, st9};
		
		// 국어점수
		screen.koreanScoreScreen();
		for (StudentInfo student : students) {
			System.out.print( " " + student.getStudentName() + " | ");
			System.out.print( student.getStudentID() + " |   ");
			System.out.print( student.getMainSubject() + "   | ");
			System.out.print( student.getKoreanScore() + " : ");
			System.out.print( student.koreanCredit() );
			System.out.println();
		}

		// 수학점수
		screen.mathScoreScreen();
		for (StudentInfo student : students) {
			System.out.print( " " + student.getStudentName() + " | ");
			System.out.print( student.getStudentID() + " |   ");
			System.out.print( student.getMainSubject() + "   | ");
			System.out.print( student.getMathScore() + " : ");
			System.out.print( student.mathCredit() );
			System.out.println();
		}
		
		// 방송댄스 점수
		screen.danceScoreScreen();
		for (StudentInfo student : students2) {
			System.out.print( " " + student.getStudentName() + " | ");
			System.out.print( student.getStudentID() + " |   ");
			System.out.print( student.getMainSubject() + "   | ");
			System.out.print( student.getDanceScore() + " : ");
			System.out.print( student.danceCredit1());
			System.out.println();
		}
	}
}
