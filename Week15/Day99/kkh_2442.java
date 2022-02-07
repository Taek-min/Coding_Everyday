import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2 * N - 1; j++) {
				if ((j < N && N - i - 1 <= j) || (j + 1 >= N && j - N < i)) {
					System.out.print("*");
				} else if (N - i - 1 > j) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

// 잘풀었네용