import java.util.Scanner;

public class Main
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int testcase = sc.nextInt();
       
       for(int i = 0; i < testcase; i++){
           int num = sc.nextInt();
           boolean check = false;
           
           if(num < 10){
               if(((num*num)% 10) == num){
                   check = true;
               }
           }
           else if(num < 100){
               if(((num*num)% 100) == num){
                   check = true;
               }
           }
           else if(num < 1000){
               if(((num*num)% 1000) == num){
                   check = true;
               }
           }
           
           if(check){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
       }
   }
}