package exam3;

public class Line extends Shape {

	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Line(int count, String shape) {
		super(count, shape);
	}

	@Override
	public void print() {
		for (int i = 0; i < count; i++) {
			if (shape.equals("|")) {
				System.out.println(shape);
			} else {
				System.out.print(shape);
			}
		}
		System.out.println();
	}
}