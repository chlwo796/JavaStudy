package exam4;

public class VerticalLine extends Absline{

	public VerticalLine(int length) {
		super(length);
		// 상속관계에 있을 때 자식 객체를 생성하면 자식 객체는 부모 객체를 초기화하고
		// 되돌아와서 자신의 객체를 초기화
	}
	
	
	@Override
	public String toString() {
		// 도형 정보 수정
		return "수직선 그리기, 수직선 길이 : " + getLength() + "";
		// 부모의 length가 private 이므로 getLength() 메소드로 가져오기
	}
	
	@Override
	public void draw() {
		// 선의 길이 만큼 제시된 문자열을 반복해서 표시
		for(int i = 0;i<getLength();i++) {
			System.out.println("|");
		} // end for
		System.out.println(); // 줄바꿈
	}
}