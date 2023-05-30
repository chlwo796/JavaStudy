package exam3;

public class Side extends Shape {
	int length;
	int width;

	public Side() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Side(int count, String shape, int length, int width) {
		super(count, shape);
		this.length = length;
		this.width = width;
	}

	@Override
	public void print() {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = 0; k < length; k++) {
					System.out.print(shape);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}