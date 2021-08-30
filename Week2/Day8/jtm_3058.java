import java.util.Scanner;
import java.util.Arrays;

class Main{
    public int findingEven(int []testData){
      int min = 0;
      Arrays.sort(testData);
      for(int i = 0; i < 7; i++) {
         if(testData[i] % 2 == 0) {
            min = testData[i];
            break;
         }
      }
      return min;
   }
    
   public int plusEven(int []testData){
      int sum = 0;
      int min = 0;
      Arrays.sort(testData);
      for(int i = 0; i < 7; i++) {
         if(testData[i] % 2 == 0) {
            sum += testData[i];
         }
      }
      return sum;
   }
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int numberInfo = sc.nextInt();
      int []testData = new int[7];
      int result = 0;
      int result2 = 0;
      Main myTest = new Main();
      
      for(int i = 0; i < numberInfo; i++) {
         for(int j= 0; j < 7; j++) {
            testData[j] = sc.nextInt();
         }
         result = myTest.plusEven(testData);
         result2 = myTest.findingEven(testData);
         System.out.println(result + " " + result2);
      }
      
   }
}
