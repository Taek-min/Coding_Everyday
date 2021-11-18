import java.util.Scanner;

public class Main { //// 왤케 잘해..
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i = 0; i < 2 * N - 1; i++) {
			for(int j = 1; j < N + 1; j++) {
				if(N - i > 0 ? N - i <= j : i - N < j - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}