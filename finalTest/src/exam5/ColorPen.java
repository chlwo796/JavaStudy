package exam5;

public class ColorPen {
   // 색상표현 - color
   // 전체 객체 생성 수 누적 - allCount
   //인스턴스 변수 - 객체가 생성될때 객체 안에 만들어짐, heap 영역 만들어지
   //             객체 마다 새롭게 생성(독립적)
//   private String color; // 객체 단독
//   public int allCount;  // 객체 공통
//   public int greenCount; // 녹색 펜 객체
   
   //누적 시키기- 모든 객체에서 공통으로 사용하게 하기 - static, 데이터영역의 클래스 안에 생성
   //static 메소드와 필드는 클래스가 메모리에 로드 될때 함께 클래스 안에 생성,
   //       항상 메모리에 존재, 어디서나 공통으로 사용 가능
   private String color; // 객체 단독
   public static int allCount;  // 객체 공통
   public static int greenCount; // 녹색 펜 객체
   
   //생성자
   public ColorPen() {}
   public ColorPen(String color) {
      this.color = color;
      allCount++;  //객체가 생성될 때마다 누적(전체 펜(객체) 수
      
      // 녹색 펜의 개수
      //#1. 방법1 - color가 green 인지 체크
      //             green, GREEN,Green, GReen,...
      //            color.equals("gree");  color.equals("GREEN");  color.equals("GReen");...
      //            equal()는 대소문자를 구분하지 않음
      //            equalsIgnoreCase() : 대소문자 구분하지 않고 문자열 비교
      if(color.equalsIgnoreCase("green")){
         greenCount++;  // 녹색 펜 누적
      }//end of if
      
      //#2. 방법2 - compareTo() => 문자열을 비교 결과가 정수(1, 0, -1)
      //     color.compareTo("green");  -> color에 담기 문자열과 green이 같으면 0을 반환
      //                                  사전순   color담긴 문자열이 green 보다 크면 : 1을 반환
      //                                         color담긴 문자열이 green 보다 작으면 : -1을 반환
      //                                 대소문자 구분해서 비교
      //     color.compareToIgnoreCase("green");  - 대소문자 구분하지 않고 비교
      //  
//        if(color.compareToIgnoreCase("green")==0) {
//           greenCount++;
//        }
//      
      
   }// 생성자 끝
   public String getColor() {
      return color; //getter, private
   }
   public void setColor(String color) {
      this.color = color;  // private
   }
   //호출하면 결과를 내보내기 위해, 인스턴스 메소드 - 객체마다 따로 사용
//   public int getAllCount() {  // 전체 펜의 개수를 물을 때 호출
//      return allCount;
//   }
//   public int getGreenCount() { // 녹색 펜의 개수를 물을 때 호출
//      return greenCount;
//   }
   
   //어디서나 공통으로 호출해서 사용 - static
   // static  메소드에서는 static 필드만 호출 가능
   //        인스턴스메소드는 객체가 생성되어야 만 만들어짐, 그래서 언제 만들어질지 모름
   //        이미 메모리에 올라와 있는 곳에 언제 메모리에 만들어질지 모르는 객체를 호출할 수 없음
   public static int getAllCount() {  // 전체 펜의 개수를 물을 때 호출
      return allCount;
   }
   public static int getGreenCount() { // 녹색 펜의 개수를 물을 때 호출
      return greenCount;
   }
      
}