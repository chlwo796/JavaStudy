package exam8;
//# 학생 정보

import java.text.DecimalFormat;

public class Student {
	//#1. 필드 - 인스턴스 필드, 객체가 생성될 때 메모리 로드
	String name; //이름
	String sn;// 학번
	Subject[] subject;// 수강과목 객체담을 변수, 수강과목별 점수
				// 배열 공간확보 아직 안한 상태, Subject타입의 배열을 사용하겠다고만
				// 학생마다 수강과목수가 모두 다름, 
				// 따라서 객체를 생성할 때 수강과목수를 입력 받아서 공간을 확보
				//    => 생성자에서 객체의 공간을 확보

	//#2. 생성자 - 객체를 초기화하는 역할, 객체를 이용할 수 있도록 준비시키는 작업
	public Student() { }// 기본생성자, 필요하지 않으면 생략 가능
	// 생성자 - 매개값이 있는 생성자 
	public Student(String name, String sn,int subjectCount) {
		super();
		this.name = name; //학생명 초기화
		this.sn = sn; // 학번 초기화
					
		//입력받은 수강과목 수에 맞게 배열공간을 확보
		this.subject = new Subject[subjectCount];
	}
	
	//#3. 메소드
	  //#3-1. 메소드 -> 성적 처리를 위한 작업,  과목과 점수 저장
	   //          객체 생성시 넘겨 받은 과목과 점수를 이용해서 배열에 저장
	  public void addSubject(String subjectName, int subScore) {
		// 과목과 점수를 받았으면 이것을 이용해서 객체를 생성
		Subject newSub = new Subject(subjectName, subScore);
		
		// 한 사람의 수강과목들은 모두 누적되면서 저장되어야함
		// 배열에,    => 배열공간이 빈 곳에 저장하는 것이 중요
		//          => 배열의 요소가 비어있는지 체크 필요
		//          => 배열 요소가 비어있는 공간에 객체를 담기
		
		for(int i=0; i<subject.length; i++) {
			//빈 공간(요소) 체크 ->if
			if(subject[i]== null) { //this.subject = new Subject[subjectCount];
									// 공간에 빈 요소 있가 있으면
				subject[i] = newSub; // 그 빈요소에 지금 만든 객체(Subject newSub = new Subject(subjectName, subScore);)
								//담아주고
				break; // 새로 생성한 객체를 이미 담았으니 더 이상 빈 공간 찾을 필요 없으므로 반복문 빠져 나가기  
			}// end of if
		} // end of for
	 }//end of addSubject
	
	  // 평균 점수의 자릿수 맞추기
	  // 숫자를 형식에 맞춰 문자열로 처리
//	  DecimalFormat f = new DecimalFormat("숫자를표현하려는 패턴");
	  // # - 숫자,  0-숫자(자릿수가 부족하면 0으로 채움)
	  //"#,##0.00" - 천단위구분기호(,)를 사용하고 소수이하 둘째자리까지 표시
	  DecimalFormat f = new DecimalFormat("#,##0.00");
	
	  //#3-2 메소드 - 과목의 총점과 평균
	  public void showInfo() {
		  int scoreSum = 0;
		  double avg = 0.0;
		  
		  for(int i=0; i<subject.length; i++) {
			  scoreSum += subject[i].subScore;
		  }
		  
		  avg = (double)scoreSum / subject.length;
		  
		  System.out.println("*** " + name + "님 성적 ***");
		  System.out.println("학 번 : " + sn);
		  System.out.println("총 점 : " + scoreSum);
		  System.out.println("평 균 : " + f.format(avg)); //패턴에 맞춰 표현
	  }
	
	  //#3-3. 과목별 점수를 확인
	 public void individualScore() {
		 System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		 for(Subject subj : subject) {//subject 배열의 요소를 subj에 순차적으로 넘겨주기
			 subj.subjectInfo(); // subj가 가리키는 객체의 subjectInfo() 읽어오기
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
