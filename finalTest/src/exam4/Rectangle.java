package exam4;

// 면
public class Rectangle extends Shape {
	// 사각형의 너비와 높이를 설정
	private int width; // 너비
	private int height; // 높이
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

		// setHeight(height); // 초기화 방법에는 여러가지가 있다.
		// setWidth(width);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사각형 그리기, 사각형(너비 : " + width + ", 높이 : " + height + ")";
	}

	@Override
	public void draw() {
		// 도형그리기 = 가로와 세로
		for(int i = 0;i<height;i++) { // 높이 = 행
			for(int j = 0;j<width;j++) { // 너비 = 열
				System.out.print("#");
			}
			System.out.println(); // 행 바꾸기
		}
		System.out.println(); // 줄바꿈
	}
}