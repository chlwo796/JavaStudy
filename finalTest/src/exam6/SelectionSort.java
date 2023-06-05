package exam6;

import java.util.Arrays;

public class SelectionSort {
   public static void main(String[] args) {
      //1. 선택 정렬 - 앞에서부터 기준을 정해서 더 작은 값을 앞으로 오도록
      // 학생 6명의 성적을 오름차순으로 선택 정렬
        //score = {96, 70, 85, 100, 65, 30};
      int[] score = {96, 70, 85, 100, 65, 30};
      int temp=0;
      
      for(int i=0; i<score.length-1; i++) { // 시작값; 최종값(=조건식); 증감값;
         // score[i]번째 비교 기준
         // score[j]번째 비교 되는 값
         int j = i+1; //다음 값을 비교, 시작값
         
         do {
            //비교 score[i] 요소값과 score[j]번째 요소의 값 비교해서
            //   더 작은 값을 score[i]번째 값으로 오도록 값을 교환
            // 어떤 값이 더 작은지 비교 ==> if문
            if(score[i] > score[j]) {
               //score[i]번째에는 더 작은 값을 담아야 함
               // 값을 교환하는 작업
               temp = score[i] ; //temp라는 임시 그릇에 score[i]번째 값을 담기
               score[i] = score[j];
               score[j] = temp;
            }
            j++; //증감값
            
         }while(j<score.length);  // 최종값(=조건식)
         
      }//end of for
      
      // #방법1) 출력 - Arrays.toString()메소드
      System.out.println(Arrays.toString(score)); // 배열을 문자열로 출력
//      
//      //#방법2) for문
//      for(int i=0; i<score.length; i++) {
//         System.out.print(score[i] + " ");
//      }
//      System.out.println();
//      
//      //#방법3) 향상된 for문
//      //  타입 변수 : 배열 또는 컬렉션 객체
//      for(int in : score) {
//         System.out.print(in + "  ");
//      }
//      System.out.println();
      
   }
}