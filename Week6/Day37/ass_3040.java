import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]num = new int[9];
        for (int f = 0; f < 9; f++)
        {
            num[f] = scan.nextInt();
        }
        //// avr, ck 가 어떤 변수명을 의미하는지 모르겠습니다. 
        int avr = 0;
        //// ck 라는 변수를 굳이 쓸 필요가 없어보입니다.
        int ck = 100;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //// 조건에서 중복이 없다고 해서 굳이 필요없는 코드입니다.
                if (i == j)
                    continue;
                    //// for문 괄호도 없고 avr += num[g]; 들여쓰기도 안되어있습니다.
                for (int g = 0; g < 9; g++)
                avr += num[g];
                avr = avr - num[i] - num[j];
                if (avr == ck) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j)
                            System.out.println(num[k]);
                    }
                    return;
                }
                avr = 0;
            }
        }
    }
}