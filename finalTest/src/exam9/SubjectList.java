package exam9;

public class SubjectList {
	//#1. 필드
	private String subjectName; // 수강과목명
	private int subScore;// 과목 점수
	
	//#2. 생성자
	public SubjectList() {}

	public SubjectList(String subjectName, int subScore) {
		super();
		this.subjectName = subjectName;
		this.subScore = subScore;
	}

	//#3. 메소드
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubScore() {
		return subScore;
	}

	public void setSubScore(int subScore) {
		this.subScore = subScore;
	}

	@Override
	public String toString() {
		return "[과목명 : " + subjectName + ", 점수 : " + subScore + "]";
	}
}
