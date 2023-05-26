package finalTest;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 숫자 n 입력받기
		// 행 = n, 열 = n, 값 = 1부터 n만큼 증가

		Scanner scanner = new Scanner(System.in);
		String question = "숫자를 입력해주세요.(1~) 종료 = 0";
		int inputNum = 0;
		int addNum = 1;
		while (true) {
			System.out.println(question); // 메세지출력
			inputNum = scanner.nextInt(); // 숫자 n 입력
			if (inputNum == 0) {
				System.out.println("종료");
				break;
			} // end if
			
			// 배열이용하지 않고 출력하기
			for(int i = 0;i<inputNum;i++) { // 행
				for(int j = 0;j<inputNum;j++) { // 열
					System.out.printf("%d\t",addNum);
					addNum+=inputNum;
				} // end 열
				System.out.println(); // 줄바꿈
			} // end 행
			System.out.println("==============배열처리없이 출력==============");
			int[][] numberArray = new int[inputNum][inputNum]; // 2차원배열생성
			printArray(numberArray); // 출력메소드실행
			// 메소드 실행 후 while 반복작업조건 추가
		} // end while
	} // end main()

	public static void printArray(int[][] numberArray) {
		int plusNum = 1; // 배열[0][0] 초기값
		for (int i = 0; i < numberArray.length; i++) { // 행길이 = 전체배열의 길이
			for (int j = 0; j < numberArray[i].length; j++) { // 열길이 = 해당 행의 요소수
				numberArray[i][j] = plusNum; // 초기값 대입
				plusNum += numberArray.length; // 대입 후 배열길이만큼 증가시키고 다시 대입
				System.out.printf("%d\t", numberArray[i][j]); // 출력
			} // end 내부 for
			System.out.println(); // 줄바꿈
		} // end 외부 for
		System.out.println("==============2차원배열 출력==============");
	} // end printArray()
}