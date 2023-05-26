package exam2;

public class CarExam {
	public static void main(String[] args) {
		// 클래스(설계도, 붕어빵틀) -> 객체 생성(붕어빵 만들기) -> 객체 사용하기

		// # 2. 객체 생성(붕어빵 만들기)
		// 어떤 붕어빵틀인지 붕어빵 담을 그릇 = 붕어빵 만들기
		// 클래스명 참조변수 = new 클래스명();

		Car car = new Car();
		Car carYellow = new Car("아우디", "노랑", 250);
		Car carBlue = new Car("소나타", "파랑", 280);
		
		car.name= "벤츠";
		car.color= "green";
		car.speed = 3000;
		car.showInfo();
		System.out.println();
		
		carYellow.showInfo();
		carYellow.drive(300);
		car.showInfo();
		System.out.println();
		
		carBlue.showInfo();
		carBlue.drive(290);
		car.showInfo();
		System.out.println();
	}
}
