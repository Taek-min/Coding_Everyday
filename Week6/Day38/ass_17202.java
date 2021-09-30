import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stnum1 = scan.nextLine();//// 변수명은 카멜 표기법으로 사용하시라고 선생님께서 알려주셨어요 그리고 st가 뭘 의미하는지 모르겠네요~ 카멜 표기법 ex: stNum1
        String stnum2 = scan.nextLine();
        int[] num1 = Stream.of(stnum1.split("")).mapToInt(Integer:: parseInt).toArray();
        int[] num2 = Stream.of(stnum2.split("")).mapToInt(Integer:: parseInt).toArray();
        int[] avr = new int[15];
        int cnt = 0;
        for (int f = 0; f < 8; f++)
        {
            avr[cnt] = (num1[f] + num2[f]) % 10;
            cnt++;
            if (f == 7)
                break;
            avr[cnt] = (num1[f + 1] + num2[f]) % 10;
            cnt++;
        }
        for (int i = 14; i >= 2; i--) {
            for (int f = 0; f < i; f++) {
                if (f == i)
                    break;
                avr[f] = (avr[f] + avr[f + 1]) % 10;
            }
        }
        System.out.print(avr[0]);
        System.out.print(avr[1]);
    }
}