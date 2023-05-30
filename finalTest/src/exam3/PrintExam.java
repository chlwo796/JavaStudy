package exam3;

import java.util.Scanner;

public class PrintExam {
	public static void main(String[] args) {

		// 공용예제1. 점, 직선(수평선), 면을 그리기
		// 도형을 몇개 그리겠습니까?
		// 입력받는 개수 만큼 아래의 작업 계속
		// 어떤 도형을 그리겠습니다.(도형선택?)
		// 점 = 길이 입력안받음
		// 수평선 = 길이 입력받기
		// 수직선 = 높이 입력받기
		// 면 = 너비/높이 입력받기
		// 계속하시겠습니까?

		Scanner scanner = new Scanner(System.in);
		Shape shape = null;
		int inputNum = 0;
		int menuNum = 0;
		int inputLength = 0;
		int inputWidth = 0;
		while (true) {
			System.out.println("도형그리기게임~~~~~~도형개수입력!!!");
			inputNum = scanner.nextInt();
			System.out.println("1. 점 2. 선 3. 면 0. 종료");
			menuNum = scanner.nextInt();
			if (menuNum == 0) {
				break;
			} else if (menuNum == 1) {
				shape = new Dot(inputNum, ".");
			} else if (menuNum == 2) {
				System.out.println("1. 수직선 2. 수평선 0. 이전");
				menuNum = scanner.nextInt();
				if (menuNum == 0) {
					continue;
				} else if (menuNum == 1) {
					shape = new Line(inputNum, "|");

				} else {
					shape = new Line(inputNum, "-");
				}
			} else {
				System.out.println("면의 세로 입력");
				inputLength = scanner.nextInt();
				System.out.println("면의 가로 입력");
				inputWidth = scanner.nextInt();
				shape = new Side(inputNum, "#", inputLength, inputWidth);
			}
			shape.print();
			System.out.println("1을 누르면 계속, 나머지 종료");
			menuNum = scanner.nextInt();
			if (menuNum == 1) {
				continue;
			} else {
				break;
			}
		}
	}
}