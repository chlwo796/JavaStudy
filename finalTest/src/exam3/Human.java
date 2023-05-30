package exam3;

// # 2. 자식 클래스 만들기(Animal 상속)
public class Human extends Animal {
	// # 2-1 필드, Human만 처리할 특징
	String food;
	String language;

	// # 2-2 필드, 생성자 = 생략 가능
	public Human() {
		super();
	}

	public Human(String name, int age, int leg, String food, String language) {
		super(name, age, leg); // 부모 생성자 호출, 부모 객체를 초기화하기 위해
		this.food = food;
		this.language = language;
	}

	// # 2-3 메소드
	public void showInfo() {
		System.out.println(
				name + "이라는 사람은 " + age + "살이고, " + leg + "개의 다리가 있고, " + food + "를 먹고, " + language + "를 사용합니다.");
	}
}