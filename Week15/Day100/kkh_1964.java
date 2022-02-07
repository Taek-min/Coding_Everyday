import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      long N = in.nextInt();
      long point = 5;
      long nextPoint = 5;
      
      if(N > 1) {
         nextPoint = 7;
         point = 12;
      }

      for(int i = 2; i < N; i++) {
         nextPoint += 3;
         point += nextPoint;
      }
      
      System.out.println(point % 45678);
   }
}