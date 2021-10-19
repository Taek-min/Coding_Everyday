import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		for(int i = 0; i < testcase; i++) {
			int histogram = in.nextInt();
			for(int j = 0; j < histogram; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

}
