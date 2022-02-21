import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();

		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= line * 2 - i; j++) {
				if(i <= j && j <= line * 2 - i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
// EZ