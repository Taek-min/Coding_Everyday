import java.util.Scanner; //// import 후 줄바꿈 하나는 국룰: 2

public class Main//// 성수 역시 잘푸네 ^^ 
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int min=0;
      int max=0;
      for(int i = 0 ; i<10;i++)
      {
          int subout = scan.nextInt();
          int subin = scan.nextInt();
          min=subin-subout; 
          if(min>=max){
              max=min;
          }
      }
      System.out.println(max);
   }
}