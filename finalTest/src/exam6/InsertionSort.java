package exam6;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		// inArr = {96, 70, 85, 20, 63, 30};
		// 96       70, 85, 20, 65, 30
		
		int[] inArr = {96, 70, 85, 20, 65, 30};
		int i = 0; // 밖 for, 정렬안된 곳
		int j = 0; // 안 for, 정렬된 곳
		int key = 0; // key값, 정렬될 부분의 자료들과 비교할 값(정렬 안된 부분의 첫번째 요소값)
		
		for(i = 1;i<inArr.length;i++) { // 정렬 안된 곳
			key = inArr[i];
			for(j=i-1;j>=0;j--) { // 정렬 된 곳
				// key 값이 정렬된 부분의 값들과 비교(판단, if문) 해서 더 작은가? 작으면 자리바꿈, 크면 삽입
				if(inArr[j]<=key) { // 비교해서 정렬 안된 부분의 비교값이 key보다 작으면 더 이상 비교가 필요 없음
					break; // 비교 멈춤
				}
				inArr[j+1] = inArr[j]; // key가 정렬된 부분의 비교 값보다 작으면 자리교환
			} // end 내부 for
			inArr[j+1] = key; // 1번 위치, key 값이 비교대상 값보다 크므로 비교대상 뒤쪽에 위치시키면 됨
		}
		System.out.println(Arrays.toString(inArr));
	}
}