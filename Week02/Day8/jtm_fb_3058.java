import java.util.Scanner;
import java.util.Arrays;

//// �Լ�Ȱ�� ������! : 2
//// ���� �̰� �ǵ�� ���� ������ �� �Y�x�µ� ������
class Main{
   //// �Լ� �̸� ù �ܾ�� ����� �ϴ°� ���� (finding X find O) , ������ϴ�.
   //// findEven'¦���� ã�´�' �س��� '¦���� �� �� �ּҰ�'�� ã�� �ִµ� �̸� �� �� ��Ȯ�ϰ� �����ָ� ������
    public int findMinOfEven(int []testData){
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
   
   //// �ǹ��ְ� �۸��غ����� �õ� Ī����
   public int plusEven(int []testData){
      int sum = 0;
      int min = 0;
      //// ������ �ʿ䰡 ���� �ʾ�? : 22  - �̰Ŵ� ġ�ٰ� �߸� �޾Ѵٰ� �մϴ�.
      //// �� �����ϴٰ� �߰��� ���߾� �Ǽ��Ǽ�
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
      int sumOfEvenNumbers = 0;
      int minOfEvenNumbers = 0;
      //// plusEven, findingEven �Լ��� static �Լ��� ����� �̷��� ��ü�� ������ �ʾƵ� �� : 22
      Main myTest = new Main();
      
      for(int i = 0; i < numberInfo; i++) {
         for(int j= 0; j < 7; j++) {
            testData[j] = sc.nextInt();
         }
         //// ��͵� ���� ���result��� ��������� �ʰ� sumOfEvenNumbers, minOfEvenNumbers ������ ��ü������ ǥ�������� �� ��������
         sumOfEvenNumbers = myTest.plusEven(testData);
         minOfEvenNumbers = myTest.findMinOfEven(testData);
         System.out.println(sumOfEvenNumbers + " " + minOfEvenNumbers);
      }
      
   }
}


