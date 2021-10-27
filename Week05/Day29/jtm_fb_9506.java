import java.util.Scanner;
public class Main { //// 현민이랑 다를게없네 b : 택민 ;; 집에 CCTV 떼가라니깐 :굿이에유

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         int num = sc.nextInt();
         if(num == -1)
            break;
         
         int[] arr = new int[num];
         int sumDivisor = 0;         
         int index = 0;         
         for(int i=1; i<num; i++) {
            if(num % i == 0) {      
               arr[index++] = i;   
               sumDivisor += i;      
            }
         }
         
         if(sumDivisor != num) {
            System.out.println(num + " is NOT perfect.");
            continue;
         }
         
         //// System.out.printf("%d = ", num); 요거 편함
         System.out.printf("%d = ", num);
         
         for(int i=0; i<index; i++) {
            if(i == index-1)
               System.out.print(arr[i]);
            else
               System.out.print(arr[i] + " + ");
         }
         System.out.println();
      }
   }
}