import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int min=0;
      int max=0;
      //// 변수 이름은 의미있게 지어주십쇼
      int hum=0;
      for(int i = 0 ; i<10;i++)
      {
          int subout = scan.nextInt();
          int subin = scan.nextInt();
          //// min+=subin - subout 으로 하면 hum 변수선언 없이 풀 수 있을것 같아요. :2
          min=subin-subout;
          hum=hum+min;
          
          if(hum>=max){
              max=hum;
          }
      }
      System.out.println(max);
   }
}