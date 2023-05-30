package exam3;

public class AnimalExam {

	public static void main(String[] args) {
		// 클래스 생성 -> 객체 생성 -> 객체 사용
		
		// # 3. 객체 생성(붕어빵 틀을 가져다 붕어빵을 만들기)
		Animal animal = new Animal("사람", 10, 4);
		
		// # 4. 객체 사용
		animal.sound();
		System.out.println(animal.toString());
		System.out.println(animal);
		
		// # 3. 객체 생성 - Dog, Human
		Dog dog = new Dog();
		Dog dog1 = new Dog("멍멍이", 3, 4);
		
		Human human = new Human();
		Human human1 = new Human("홍길동,", 20, 2, "햄버거", "한국어");
		
		dog.name = "복실이";
		dog.age = 2;
		dog.leg = 4;
		
		dog.sound();
		System.out.println(dog.toString());
		System.out.println();
		
		dog1.sound();
		System.out.println(dog1.toString());
		System.out.println();
		human1.showInfo();
		System.out.println(human1.toString());
		

	
	}
}