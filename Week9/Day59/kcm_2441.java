import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int starLine = in.nextInt();
		for(int i = 0; i < starLine; i++) {
			for(int k = i; k > 0; k--) {
				System.out.print(" ");
			}
			for(int j = starLine - i ; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
