import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]num = new int[9];
        for (int f = 0; f < 9; f++)
        {
            num[f] = scan.nextInt();
        }
        int avr = 0;
        int ck = 100;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j)
                    continue;
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