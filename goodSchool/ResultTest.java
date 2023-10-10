package goodSchool;

import java.util.ArrayList;
import java.util.List;

public class ResultTest {

	public static void main(String[] args) {

		List<StudentInfo> StudentList = new ArrayList<StudentInfo>();

		// 위쪽 목록 삽입

		ResultScreen resultScreen = new ResultScreen();

		StudentList.add(new StudentInfo("안성원", 181213, "국어", 95, 56));
		StudentList.add(new StudentInfo("오태훈", 182330, "수학", 95, 98));
		StudentList.add(new StudentInfo("이동호", 171518, "국어", 100, 88));
		StudentList.add(new StudentInfo("조성욱", 172350, "국어", 89, 95));
		StudentList.add(new StudentInfo("최태평", 171290, "수학", 83, 56));
		
		StudentList.add(new StudentInfo("안성원", 181213, "국어", 80));
		StudentList.add(new StudentInfo("오태훈", 182330, "수학", 70));
		StudentList.add(new StudentInfo("이동호", 171518, "국어", 60));


		
		resultScreen.KoreanResultScreen();
		for (int i = 0; i < StudentList.size(); i++) {
			StudentInfo list = StudentList.get(i);
			System.out.print(" " + list.getStudentName() + " | ");
			System.out.print(list.getStudentID() + " |   ");
			System.out.print(list.getMainSubject() + "   | ");
			System.out.print(list.getKoreanScore() + " : ");
			System.out.println(list.koreanGrade());

		}
		System.out.println();

		resultScreen.MathResultScreen();
		for (int i = 0; i < StudentList.size(); i++) {
			StudentInfo list = StudentList.get(i);
			System.out.print(" " + list.getStudentName() + " | ");
			System.out.print(list.getStudentID() + " |   ");
			System.out.print(list.getMainSubject() + "   | ");
				System.out.print(list.getMathScore() + " : ");
			System.out.println(list.mathGrade());
		}
		System.out.println();
		
		
		resultScreen.DanceResultScreen();
		for (int i = 0; i < StudentList.size(); i++) {
			StudentInfo list = StudentList.get(i);
			System.out.print(" " + list.getStudentName() + " | ");
			System.out.print(list.getStudentID() + " |   ");
			System.out.print(list.getMainSubject() + "   | ");
			System.out.print(list.getDanceScore() + " : ");
			System.out.println(list.danceGrade1());
		}
		System.out.println();



	}
}
