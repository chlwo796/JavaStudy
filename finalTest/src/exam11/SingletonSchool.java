package exam11;

public class SingletonSchool { // 클래스

	
	// 싱글톤 = 싱글톤은 객체를 하나만 만들도록 하는 것
	// 		  싱글톤은 단 하나의 객체만 만들도록 보장하는 것
	// 		  클래스를 싱글톤으로 만들기 위해서는 접근제한자를 private로 선언
	// 		  싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 해야한다.
	//    	  new 연산자로 외부에서 생성자를 호출할 수 없도록 하기 위해
	//        생성자의 접근제한자를 private로 선언
	//   	  자신의 타입인 정적(static) 필드를 하나 선언하고 자신의 객체를 생성해서
	//    	  클래스 내부에서는 new 연산자로 생성자 호출이 가능
	
	// 필드
	
	private static SingletonSchool singletonSchool = new SingletonSchool();
	//    			자신클래스타입 	    참조변수   = new 클래스명(=생성자)();
	// private static SingletonSchool instance = new SingletonSchool(); // instance라는 이름으로도 사용한다.
	
	// 생성자 = 싱글톤 객체를 만들기 위해서는 private
	
	private SingletonSchool() {}
	// private 클래스명() {}
	
	// 메소드 = 정적 메소드로
	static SingletonSchool getSingletonSchool() {
	// 정적      반환타입            메소드명 (){} 
		return singletonSchool;
	}
	static SingletonSchool getInstance() {
		// getInstance()라는 메소드명을 자주 이용한다.
		return singletonSchool;
	}
}