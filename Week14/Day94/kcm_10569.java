import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		for(int i = 0; i < testCase; i++) {
			int v = in.nextInt();
			int e = in.nextInt();
			System.out.println(2 + e - v);
		}

	}

}
