import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int len[] = new int [4];
      int min = 1000;
      
      for(int i = 0; i < 4; i++) {
         len[i] = in.nextInt();
         if(min > len[i]) min = len[i];
      }
      
      if(len[2] - len[0] < min) {
         min = len[2] - len[0];
      } 

      if(len[3] - len[1] < min) {
         min = len[3] - len[1];
      } 
      
      System.out.println(min);
   }
}

// 잘풀었어