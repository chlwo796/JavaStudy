package exam8;

//# 수강과목 정보
public class Subject {
	// 학생 마다 수강 과목이 다르다.
	// 각 학생의 수강 정보와 수강 과목의 점수를 객체를 생성하면서 제공한다.
	// 이름 : 홍길동, 학번 : 20230301, 국어:75, 영어:80
	// 이름 : 박자바, 학번 : 20230302, 국어:95, 영어:50, 수학:96, 과학: 95
	// ...
	// 각 학생의 수강 정보와  수강과목의 점수의 합계와 평균을 계산
	// 배열, ArrayList 중 하나 이용
	// 상속을 이용해도 좋고 포함관계를 이용해도 좋음
	// Subject, Student, StudentMain
  
	//#1. 필드
	String subjectName; // 수강과목명
	int subScore;// 과목 점수
	
	//#2. 생성자
	public Subject() {}

	public Subject(String subjectName, int subScore) {
		super();
		this.subjectName = subjectName;
		this.subScore = subScore;
	}
	
	//#3. 메소드(국어 : 89)
	public void subjectInfo() {
		System.out.println(subjectName + " : " + subScore);
	}

}
