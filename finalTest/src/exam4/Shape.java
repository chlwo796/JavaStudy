package exam4;

public abstract class Shape {
	// 점, 직선(수평선, 수직선), 사각형에 공통으로 작업할 것을 작성
	// 어떤 도형을 그리는지 메시지
	// 도형을 그리는 작업
	
	// # 1. 어떤 도형을 그리는지 알려주는 메시지를 처리할 메소드
	// Object의 toString()을 재정의(오버라이딩)
	@Override
	public abstract String toString(); // 완성되지 않는 메소드 = 추상메소드, 자식이 반드시 재정의
	
	// public void show(){} = 완성 메소드({} body가 있으면 무조건 완성, {} body가 없으면 무조건 추상)
	
	// # 2. 도형 그리기 = 각 도형마다 모양이 다름, 각 자식이 완성하도록 추상메소드 선언
	public abstract void draw();
	
	// #3. 위 두 메소드를 호출해서 실행할 수 있도록
	public void print() {
		System.out.println(toString());	// 도형 정보 출력
		draw(); // 도형 그리기
	}
}