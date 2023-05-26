package finalTest;

import java.util.Scanner;

public class UpDownInClass {
	public static void main(String[] args) {
		// 랜덤 숫자를 만들고, 사용자가 그 숫자를 맞추기
		// # 1. 입력받을 수 있도록 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 지역변수 선언 = main()안에서만 사용, 종료 후 메모리에서 제거
		// 지역변수의 생존 기간 : 자신이 속한 {} 안에서만 생존 가능, {}을 벗어나면 메모리에서 삭제
		//                   stack 저장, 초기화 필요
		
		// # 2. 변수 선언
		int comValue = 0; // 컴이 생성한 값을 저장할 변수
		int userValue = 0; // 사용자가 입력한 값을 저장할 변수
		
		// # 3. 컴의 값 생성 = random() 이용해서 임의로 생성
		// 클래스명.메소드명(), 클래스명.필드명 => static
		comValue = (int) (Math.random()*100) + 1; // 1보다 크거나 같고 101보다 작은 정수값(1~100)
		
	
	}
}