package exam5;

public class ColorPenMain {

   public static void main(String[] args) {
      // static 응용 1)
      // 색연필의 개수 구하기 :  전체 색연필의(객체) 개수, 'green' 색연필(객체)의 개수 구하기
      // ColorPen 클래스를 만들고 -> 객체생성시 색상을 입력 받기
      // 색상별 객체를 생성
      //ColorPen green01 = new ColorPen("green");
      //ColorPen red01 = new ColorPen("red");
      //ColorPen green02 = new ColorPen("GREEN"); 
      // ....
      
      // 출력 :  전체 펜의 개수 : ~ 개
      //        녹색 펜의 개수 : ~ 개
      ColorPen green01 = new ColorPen("green");  //1,  1
      ColorPen red01 = new ColorPen("red");    //2
      ColorPen blue01 = new ColorPen("Blue");  //3
      ColorPen green02 = new ColorPen("GREEN");  //4   ,2
      ColorPen green03 = new ColorPen("Green");   //5   ,3
      ColorPen red02 = new ColorPen("Red");   //6
      ColorPen blue02 = new ColorPen("blue");  //7
      
//      System.out.println("전체 펜수 : " + blue02.allCount);  //1
//      System.out.println("녹색 펜의 개수 : " +  blue02.greenCount);  //0

      //static   -  클래스명.메소드명(), 클래스명.필드명
      System.out.println("전체 펜 수 : " + ColorPen.getAllCount() );//7
      System.out.println("녹색 펜 수 : " + ColorPen.getGreenCount()); //3
   }
}