import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strPhNum1 = scan.nextLine();
        String strPhNum2 = scan.nextLine();
        
        int[] num1 = Stream.of(strphNum1.split("")).mapToInt(Integer:: parseInt).toArray(); 
        int[] num2 = Stream.of(strphNum2.split("")).mapToInt(Integer:: parseInt).toArray();
        
        int[] mixedNumbers = new int[15];         
        int cnt = 0;
       
        for (int j = 0; j < 8; j++) 
        {
            mixedNumbers[cnt] = (num1[j] + num2[j]) % 10;
            cnt++;
            if (j == 7)
                break;
            mixedNumbers[cnt] = (num1[j + 1] + num2[j]) % 10;
            cnt++;
        }
       
        for (int i = 14; i >= 2; i--) {
            for (int k = 0; k < i; k++)  {
                mixedNumbers[k] = (mixedNumbers[k] + mixedNumbers[k + 1]) % 10;
            }
        }

        System.out.print(mixedNumbers[0]);
        System.out.print(mixedNumbers[1]);

    }
}