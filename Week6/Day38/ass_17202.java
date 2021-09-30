import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stnum1 = scan.nextLine();//// 변수명은 카멜 표기법으로 사용하시라고 선생님께서 알려주셨어요 그리고 st가 뭘 의미하는지 모르겠네요~ 카멜 표기법 ex: stNum1
        String stnum2 = scan.nextLine();
        int[] num1 = Stream.of(stnum1.split("")).mapToInt(Integer:: parseInt).toArray(); //// 이열 Stream 활용~
        int[] num2 = Stream.of(stnum2.split("")).mapToInt(Integer:: parseInt).toArray();
        int[] avr = new int[15]; //// 변수명은 코드를 처음 보는 사람도 코드 의도를 이해할 수 있도록 의미를 담아서 지어야 합니다! 이거 같은 경우엔 섞은 번호를 담을 변수니까 mixedNumbers 정도면 좋겠네요
        int cnt = 0;
        for (int f = 0; f < 8; f++) //// x, y같이 의미있는게 아니면 그냥 i j k로 짓는게 국룰
        {
            avr[cnt] = (num1[f] + num2[f]) % 10;
            cnt++;
            if (f == 7)
                break;
            avr[cnt] = (num1[f + 1] + num2[f]) % 10;
            cnt++;
        }
        for (int i = 14; i >= 2; i--) {
            for (int f = 0; f < i; f++)  {
                if (f == i) //// 이 if문 제거해도 맞았습니다 나옵니다. for문의 조건상 f == i가 될 일이 없어요
                    break;
                avr[f] = (avr[f] + avr[f + 1]) % 10;
            }
        }
        System.out.print(avr[0]);
        System.out.print(avr[1]);
    }
}