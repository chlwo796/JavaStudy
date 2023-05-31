package exam4;

// 직선그리기
// 수평선
// 수직선
// 수평선과 수직선이 확연한 차이가 날 때 상속관계를 이용
public class Absline extends Shape {
	// 선부터는 길이가 필요
	private int length; 
	
	// 캡슐화, 정보은닉, private은 자신의 클래스에서는 마음대로 사용할 수 있지만
	// 다른 클래스에서는 접근할 수 없음 = getter/setter 메소드 이용해서 접근
	
	// 초기화 설정 = 생성자
	public Absline(int length) {
		// this.length = length;
		setLength(length); // setter 메소드 호출하여 초기화.
	}
	
	public int getLength() {
		// 유효성 설정
		return length;
	}

	public void setLength(int length) {
		// 유효성 설정할 수 있음 = 입력받아서 처리할 수 있는 값과 없는 값을 선별
		this.length = length; // 유효한 값일 때 처리
	}

	@Override
	public String toString() {
		// 무엇을 그리는지 알려주는 메시지
		// 자신의 클래스에 선언된 private 필드는 자신의 클래스 안에서는 자유롭게 사용 가능
		return "직선 그리기, 직선(길이: " + length + ")";
	}

	@Override
	public void draw() {	} 
	// 완성메소드
	// 수평선과 수직선이 그리는 방식이 다르기 때문에
	// 각 자식에서 구현하도록 {}만 만들어 놓음
	// {}만 있어도 재정의(오버라이딩)이 된 것, 즉 구현된 것
}
