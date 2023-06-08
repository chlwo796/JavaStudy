package exam9;

import exam8.Student;

public class StudentMain {

	public static void main(String[] args) {
	
		//#1. 홍길동 객체 생성
		StudentList hong = new StudentList("홍길동", "230301");
		hong.addSubject("국어", 95);
		hong.addSubject("영어", 80);
		hong.addSubject("과학", 85);
		
		//#1-2. 홍길동의 총점과 평균 확인(showInfo)
		hong.showInfo();
		System.out.println();
		
		
		//#1-3. 홍길동의 수강 과목별 점수 확인(individualScore)
		hong.individualScore();
		System.out.println();
		
		System.out.println("=======================");
		//#2. 김자바 학생 객체 생성
		StudentList kim = new StudentList("김자바", "230302");
		kim.addSubject("국어", 100);
		kim.addSubject("역사", 95);
		
		//#2-2 김자바의 총점과 평균 확인(showInfo)
		kim.showInfo();
		System.out.println();
		//#3-3 김자바의 수강 과목별 점수 확인(individualScore)
		kim.individualScore();
		System.out.println();
		
	}

}
