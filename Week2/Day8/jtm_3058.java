import java.util.Scanner;
import java.util.Arrays;

//// 함수활용 멋져요!
//// 나는 이거 피드백 안해 옆에서 다 햊둿는데 무시함
class Main{
   //// 함수 이름 첫 단어는 동사로 하는게 관례 (finding X find O)
   //// findEven'짝수를 찾는다' 해놓고 '짝수인 것 중 최소값'을 찾고 있는데 이름 좀 더 정확하게 지어주면 좋을듯
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
   
   //// 의미있게 작명해보려는 시도 칭찬해
   public int plusEven(int []testData){
      int sum = 0;
      int min = 0;
      //// 정렬할 필요가 없지 않아? : 22  - 이거는 치다가 잘못 달앗다고 합니다.
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
      //// plusEven, findingEven 함수를 static 함수로 만들면 이렇게 객체로 만들지 않아도 됨 : 22
      Main myTest = new Main();
      
      for(int i = 0; i < numberInfo; i++) {
         for(int j= 0; j < 7; j++) {
            testData[j] = sc.nextInt();
         }
         //// 요것도 대충 결과result라고 얼버무리지 않고 sumOfEvenNumbers, minOfEvenNumbers 등으로 구체적으로 표현했으면 더 좋았을듯
         result = myTest.plusEven(testData);
         result2 = myTest.findingEven(testData);
         System.out.println(result + " " + result2);
      }
      
   }
}
