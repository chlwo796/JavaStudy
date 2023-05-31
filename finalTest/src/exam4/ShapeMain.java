package exam4;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num=0; // 그림을 그릴 도형의 개수
		Shape[] shape= null; // 입력받을 도형 객체를 저장할 배열
						// 그릴 도형의 개수를 입력받아서 그 만큼의 공간을 확보
						// 그 공간에 각 도형 객체를 담기, 도형이 다르므로 부모객체에 담기

		while (true) {
			// # 1. 메시지 출력
			System.out.println("그림을 그릴 도형의 개수 입력 : ");
			num = scanner.nextInt();

			// # 2. 입력 받은 만큼 배열 공간 확보
			shape = new Shape[num]; // 자식은 부모 타입에 저장할 수 있음. 자식은 부모가 될 수 있다.

			// # 3. 각 공간에 도형 객체를 생성해서 담기
			for (int i = 0; i < shape.length; i++) {
				int selectType = 0; // 도형 타입, 어떤 도형을 그릴 것인지 도형 모양 담기
				int len = 0; // 선의 길이
				int width, height = 0;
				do {// 반드시 한 번 이상은 실행
					System.out.println((i + 1) + "그리려는 도형 선택(1. 점 2. 수평선 3. 수직선 4. 면");
					selectType = scanner.nextInt();

				} while (selectType < 1 || selectType > 4); // 도형은 점, 수평선, 수직선, 사각형이 있으므로
				// Shape[]배열에 담기
				switch (selectType) {
				case 1:
					shape[i] = new Point();
					break;
				case 2:
				case 3:
					System.out.println("선의 길이 입력 : ");
					len = scanner.nextInt();
					// 삼항 연산자
					shape[i] = (selectType == 2) ? new HorizentalLine(len) : new VerticalLine(len);
					break;
				case 4:
					System.out.println("사각형의 너비 입력 : ");
					width = scanner.nextInt();
					System.out.println("사각형의 높이 입력 : ");
					height = scanner.nextInt();

					shape[i] = new Rectangle(width, height);
					break;
				} // end switch-case
			} // end for

			// 도형 그리기
			for (Shape d : shape) {
				d.print();
				System.out.println();
			}
			System.out.println("계속 진행하시겠습니까?(1. 진행, 0. 종료)");
			int con = scanner.nextInt();
			if (con == 0) {
				break;
			} else {
				continue;
			}
		} // end while
	}
}