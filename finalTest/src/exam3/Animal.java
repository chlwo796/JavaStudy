package exam3;
// # 1. 부모 클래스 만들기
public class Animal {
// 상속
// 클래스 = 설계도 -> 객체생성(설계도를 이용해 건물을 짓는다.) -> 객체 이용
	
	// 상속 = 부모것은 내것, 자식은 부모것을 변경해서 사용할 수 있다.
	// 		 내것은 부모것(x)
	// 		 한 부모로 부터만 물려받을 수 있다.
	
	// # 1-1 필드(공통속성, 특징)
	// 타입 변수 = 담길 자료; // 왼쪽의 타입과 오른쪽에 담길 데이터의 자료형이 일치해야 한다.
	String name; // 사용할 그릇(변수)는 반드시 선언되어야 함.
	int age;
	int leg;
	Animal ani = new Animal();
	// # 1-2 생성자 = 객체 초기화(객체를 사용할 수 있도록 준비시키기)
	// 클래스명과 같은 것
	public Animal() {
		// 기본생성자
		super(); // 보통은 생략되어있다. 부모 생성자를 호출
	}	
	public Animal(String name, int age, int leg) { // 매개변수로 선언된 변수는 지역변수-{}안에서만 사용할 수 있음
		// name = name; // 지역변수 name에 지역변수 name의 값을 담는다.
		this.name = name; // this가 붙은 것은 필드, this가 없는 것은 지역변수
					      // this는 자기 자신의 객체(Animal)
		this.age = age;
		this.leg = leg;
	} // end constructor
	
	// # 1-3 메소드 = 동작 방식, 공통적으로 하는 작업(처리)
	// 접근제어자 반환타입 메소드명(매개변수, ...) { 처리할 내용 }
	// 접근제어자 abstract 반환타입 메소드명(매개변수, ...); // 추상메소드
	// 반환타입 = 메소드의 내용을 처리하고 나온 결과의 타입으로, 메소드를 호출한 곳에 넘겨줄 값의 타입
	// public Animal aniShow(){} // 결과가(반환될 자료의 타입) Animal 객체
	// public Member showInfo(){} // 결과가(반환될 자료의 타입) Member 객체
	// public String showInfo(){} // 결과가(반환될 자료의 타입) 문자열
	// public Integer showInfo(){} // 결과가(반환될 자료의 타입) 정수형
	// public void showInfo(){} // 여기서 처리를 끝내고 넘겨주는 값은 없다.
	
	public void sound() {
		System.out.println("울음소리");
	}
	
	@Override // Object 객체가 가지고 있는 메소드, 패키지명.클래스명@해시코드값
			  // Animal에서 재정의(overriding)을 해서 사용
		  	  // Object는 모든 객체의 조상이므로, 모든 클래스는 Object를 상속받고 있음
	public String toString() {	
		// this는 지역변수와 필드를 구분할 수 없을 때는 반드시 붙여야하지만
		// 명확하게 필드라는 것을 알 수 있을 때는 생략 가능
		return "이름 : " + name + ", 나이 : " + age + ", 다리 : " + leg + "개를 가지고있다.";
	}
}