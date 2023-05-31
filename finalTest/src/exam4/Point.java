package exam4;

// 점그리기 클래스
public class Point extends Shape{
	
	@Override
	public void draw() {
		// 점 찍기, 점은 하나만 있으면 됨
		System.out.print(".");
		System.out.println(); // 다음 도형을 그릴 수 있도록 빈줄 삽입
	}
	
	@Override
	public String toString() {
		// 점 그리기
		return "점그리기";
	}
}