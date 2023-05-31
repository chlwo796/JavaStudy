package exam4;

public class HorizentalLine extends Absline{

	public HorizentalLine(int length) {
		super(length);
		// 상속관계에 있을 때 자식 객체를 생성하면 자식 객체는 부모 객체의 생성자를 호출한다.
	}
	
	
	@Override
	public String toString() {
		// 도형 정보 수정
		return "수평선 그리기, 수평선 길이 : " + getLength() + "";
		// 부모의 length가 private 이므로 getLength() 메소드로 가져오기
	}
	
	@Override
	public void draw() {
		// 선의 길이 만큼 제시된 문자열을 반복해서 표시
		for(int i = 0;i<getLength();i++) {
			System.out.print("-"); // 수평선은 줄바꿈하지 않고 출력된다.
		} // end for
		System.out.println(); // 줄바꿈
	}
}