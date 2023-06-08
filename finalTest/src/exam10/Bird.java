package exam10;

public class Bird implements BirdTreeCount {
	String name;

	public Bird(String name) {
		super();
		this.name = name;
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	public void fly() {
		System.out.println(name + "가 날아감");
	}
}
