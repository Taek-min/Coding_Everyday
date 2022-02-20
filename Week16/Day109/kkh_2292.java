import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int move = 0;
		
		for(int i = 1; i < N;) {
			move++;
			i += 6 * move;
		}
		
		System.out.println(move + 1);
	}
}
// 잘풀었네