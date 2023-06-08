package exam10;

public class Tree implements BirdTreeCount {
	String name;
	
	public Tree(String name) {
		super();
		this.name = name;
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	public void ripen() {
		System.out.println(name + "는 맛있엉");
	}
}