package exam3;

public class Shape {
	int count; // 그리는 개수
	String shape; // 도형모양

	public Shape() {
	}

	public Shape(int count, String shape) {
		super();
		this.count = count;
		this.shape = shape;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.print(shape);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "그릴 개수 : " + count + ", 모양 : " + shape;
	}
}