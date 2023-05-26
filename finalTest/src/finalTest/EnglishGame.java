package finalTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EnglishGame {
	static Scanner scanner = null;
	public static void main(String[] args) {
		// 단어맞추기 게임
		// 과일이름을 영어단어와 한글 뜻을 배열에 5개 저장하기
		// 영어단어를 입력받아 한글과일뜻을 출력하기
		// 영어단어를 출력해주고 한글 뜻 사용자로부터 입력 -> 정답, 오답
		
		int menuNum = 0; // 메뉴선택번호
		Map<String, String> wordsMap = new HashMap<>();
		wordsMap.put("apple", "사과");
		wordsMap.put("banana", "바나나");
		wordsMap.put("kiwi", "키위");
		wordsMap.put("watermelon", "수박");
		wordsMap.put("mango", "망고");
		Set<String> wordSet = wordsMap.keySet();
		
		System.out.println("단어맞추기 game start!!!!!");
		System.out.println("=================영어단어장================");
		for(String key : wordSet) {
			System.out.print(key + "\t");
		}
		System.out.println();
		System.out.println("========================================"); // 시작메뉴
		
		while(true) {
			System.out.println();
			System.out.println("1번 놀이 = 영어단어를쳐봥");
			System.out.println("2번 놀이 = 단어를맞춰보장");
			System.out.println("0번 = 종료");
			System.out.println("당신의 선택은?");
			scanner = new Scanner(System.in);
			menuNum = scanner.nextInt();
			if(menuNum == 0) {
				// 프로그램종료
				break;
			}
			if(menuNum ==1) {
				wordGame1(wordsMap);
			}
			if(menuNum ==2) {
				wordGame2(wordsMap);
			}
		} // end while
	} // end main()

	public static void wordGame1(Map<String, String> wordsMap) {
		Set<String> wordSet = wordsMap.keySet();
		scanner = new Scanner(System.in);
		System.out.println("영어단어를 쳐봥!!!");
		for(String key : wordSet) {
			System.out.println(key);
			String answer = scanner.nextLine();
			if(answer.equals(key)) {
				System.out.println(wordsMap.get(key));
			}else {
				System.out.println("땡땡떙");
			} // end if else
		} // end for
	} // end wordGame1()
	public static void wordGame2(Map<String, String> wordsMap) {
		scanner = new Scanner(System.in);
		Set<String> wordSet = wordsMap.keySet();
		for(String key : wordSet) {
			System.out.println("다음단어는 무슨뜻일까용???");
			System.out.println(key);
			String quizAnswer= scanner.nextLine();
			if(quizAnswer.equals(wordsMap.get(key))) {
				// 정답시
				System.out.println("오잉 정답!!!");
			}else{
				// 오답시
				System.out.println("ㅋㅋㅋ땡!!!!");
			} // end if else
		} // end for
	} // end wordGame2()
}