import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int frequency = sc.nextInt();
        int cnt = 0;
 
        for (int i = 1; i <= n; i++) {
            String nums = Integer.toString(i);
 
            for (int j = 0; j < nums.length(); j++) {
                int sequence = nums.charAt(j) - '0';
 
                if (sequence == frequency) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}////굿굿~:22 잘해~ :3
