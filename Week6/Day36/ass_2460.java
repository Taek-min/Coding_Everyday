import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int min=0;
      int max=0;
      int hum=0;
      for(int i = 0 ; i<10;i++)
      {
          int subout = scan.nextInt();
          int subin = scan.nextInt();
          
          min=subin-subout;
          hum=hum+min;
          
          if(hum>=max){
              max=hum;
          }
      }
      System.out.println(max);
   }
}