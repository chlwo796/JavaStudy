package exam11;

public class SingletonExam {
	public static void main(String[] args) {
		Member mem = new Member(123, "홍길동", 80);
		
		mem.memID = 456;
		System.out.println(mem); // 패키지명.클래스명@해시코드
		
		// print(), println()은 참조변수를 매개값(인수)로 받은
		// System.out.println(mem.memID);
		
		mem.memID = 567;
		System.out.println(mem.getMemID()); // 567
		System.out.println(mem); // 회원아이디 : 567, 회원
		
		System.out.println();
		Member kim = new Member(456, "김자바", 25);
		System.out.println(kim);
		
		//===========================================================
		
//		SingletonSchool singletonSchool = new SingletonSchool(); // 싱글톤은 외부에서 객체 생성 안됨
		
		SingletonSchool singletonSchool1 = SingletonSchool.getInstance();
		SingletonSchool singletonSchool2 = SingletonSchool.getInstance();
		
		System.out.println(singletonSchool1);
		System.out.println(singletonSchool2);
		
		if(singletonSchool1 == singletonSchool2) {
			System.out.println("같은 싱글톤 객체");
		}else {
			System.out.println("싱글톤이 아닌 다른 객체");
		}
	}
}