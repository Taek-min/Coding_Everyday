import java.util.Scanner;

public class kcm_2839 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kg = in.nextInt();
		int min = kg / 3;
		int count = 0;
		for(int i = 0; i <= kg / 5; i++) {
			for(int j = 0; j <= kg / 3; j++) {
				if(5 * i + 3 * j == kg) {
					count++;
					if(min > i + j) {
						min = i + j;
					}
				}
			}
		}
		if(count == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
	}
}
// 오우 잘풀었눼