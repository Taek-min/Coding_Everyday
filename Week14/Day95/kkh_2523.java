import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i = 1; i < 2 * N ; i++) {
			int print = i <= N ? i : N - (i - N); 

			for(int j = 0; j < print; j++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
	}
}