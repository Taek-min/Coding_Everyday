import java.util.Scanner;

public class kcm_1964 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		long dot = 1;
		
		for(int i = 1; i <= num; i++) {
			dot += 4 + 3 * (i - 1);
		}
		System.out.println(dot % 45678);
		
	}
}
// good :2