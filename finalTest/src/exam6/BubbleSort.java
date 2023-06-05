package exam6;

import java.util.Arrays;

public class BubbleSort {

   public static void main(String[] args) {
      // 버블정렬 - 인정합 두 원소를 검사하여 정렬하는 알고리즘
      // 학생 6명의 성적을 오름차순으로 정렬
      // score = {96, 70, 85, 20, 65, 30};
      int[] score = {96, 70, 85, 20, 65, 30};
      int temp = 0; // 자리 교환에서 사용할 임시 변수
      boolean exchange = false;
      
      for(int i=0; i<score.length-1; i++ ) { // 회전
         
         int j = 0; // do ~ while의 시작값
         do {
            // 서로 인접한 요소를 비교 => if문
            // 서로 인접한 요소를 비교해서 더 작은 값을 앞으로 이동 - 오름차순
            if(score[j] > score[j+1]) {
               temp = score[j];
               score[j] = score[j+1];
               score[j+1] = temp;
            }// end of if
            j++; // 다음 요소 비교를 위해 증가
            if(exchange == false) break;
            
         }while(j<score.length-1);
         
         //회전별로 출력
         System.out.println(Arrays.toString(score));
         
      } // end of for
      
      // 결과만 출력
//      System.out.println(Arrays.toString(score));

   }// end of main
   
} // end of class