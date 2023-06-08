package exam9;

import java.text.DecimalFormat;
import java.util.ArrayList;

import exam8.Subject;

public class StudentList {
	//#1. 필드
	String name;
	String sn;
	
	ArrayList<SubjectList> subList;
	
	//#2. 생성자
	public StudentList() {}

	public StudentList(String name, String sn) {
		super();
		this.name = name;
		this.sn = sn;
		
		subList = new ArrayList<SubjectList>();
	}
	
	//#3. 메소드 - 과목 추가
	public void addSubject(String subjectName, int subScore) {
		// 과목과 점수를 받았으면 이것을 이용해서 객체를 생성
		SubjectList newSub = new SubjectList();
		
		//private으로 선언되어 있으므로 getter/setter이용하기
		 newSub.setSubjectName(subjectName);
		 newSub.setSubScore(subScore);
		 
		 // 생성된 ArrayList 배열에 추가
		 subList.add(newSub);	
		
	}
	
	 DecimalFormat f = new DecimalFormat("#,##0.00");
	
	//#4. 과목 총점과 평균
	 public void showInfo() {
		  int scoreSum = 0;
		  double avg = 0.0;
		  
		  for(SubjectList sub : subList) {
			  scoreSum += sub.getSubScore();
		  }
		  avg = (double)scoreSum / subList.size();
		  
		  System.out.println("*** " + name + "님 성적 ***");
		  System.out.println("학 번 : " + sn);
		  System.out.println("총 점 : " + scoreSum);
		  System.out.println("평 균 : " + f.format(avg)); //패턴에 맞춰 표현
	  }
	
	
	//#5. 과목 정보
	 public void individualScore() {
		 System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		 for(SubjectList subj : subList) {//subject 배열의 요소를 subj에 순차적으로 넘겨주기
			 System.out.println(subj.toString());// subj가 가리키는 객체의 subjectInfo() 읽어오기
//			 System.out.println(subj.getSubjectName() + " : " + subj.getSubScore());
		 }
	 }
	
}
