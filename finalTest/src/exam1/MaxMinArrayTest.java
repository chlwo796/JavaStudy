package exam1;

public class MaxMinArrayTest {
	
	public static void main(String[] args) {
		// 최대값 = 배열이나 현재 있는 자료 중에 없는 값 중 가장 작은 값으로 비교
		// 최소값 = 배열이나 현재 있는 자료 중에 없는 값 중 큰값으로 비교
		
		int[] scoreArray = {7, 52, 6, 96, 85, 36};
		int max = 0; // 최대값을 담을 그릇
		int min = 999; // 최소값을 담을 그릇
		
		// 최대값 구하기
		// 최소값 구하기
		for(int i = 0;i<scoreArray.length;i++) {
			if(max<scoreArray[i]) {
				max = scoreArray[i];
			} // end if
			if(min>scoreArray[i]) {
				min = scoreArray[i];
			} // end if
			
		} // end for
		System.out.println("최대값 : " + max); // 최대값 출력
		System.out.println("최소값 : " + min); // 최소값 출력
		System.out.println(); // 줄바꿈
	} // end main()
}