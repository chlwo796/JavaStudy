package exam1;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		// 랜덤 숫자를 만들고, 사용자가 그 숫자를 맞추기

		Scanner scanner = new Scanner(System.in);
		String message = "업다운게임!!!!!!!!!!!\n숫자를입력해주세용~~종료=0";
		String upMessage = "업!!!!!!!!";
		String downMessage = "다운!!!!!!!";
		String successMsg = "성공!!!!!!!";
		int randomNum = (int) (Math.random() * 100) + 1;
		System.out.println(randomNum);
		int inputNum = 0;
		int count = 0;
		System.out.println(message);
		while (true) {
			inputNum = scanner.nextInt();
			++count; // 트라이횟수 카운트
			if (inputNum == 0) {
				// 종료커맨드
				System.out.println("종료합니당");
				break;
			}
			if (inputNum < randomNum) {
				// 사용자숫자가 게임랜덤숫자보다 작은 경우
				System.out.println(upMessage); // 업메시지출력
				continue;
			}
			if (inputNum > randomNum) {
				// 사용자숫자가 게임랜덤숫자보다 큰 경우
				System.out.println(downMessage); // 다운메시지출력
				continue;
			}
			if (randomNum == inputNum) {
				// 맞춘 후 종료
				System.out.println(successMsg); // 성공메시지 출력
				System.out.println(count + "번만에 성공하셨네용"); // 횟수 출력
				break;
			} // end if
		} // end while
	} // end main()
}