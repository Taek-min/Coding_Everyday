import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //// 생각 안난다면서 잘풀어~
		Scanner in = new Scanner(System.in);
		long[][] circl = new long[2][3];

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				circl[i][j] = in.nextInt();
			}
		}
		
		double line = Math.sqrt(Math.pow(circl[1][0] - circl[0][0], 2) + Math.pow(circl[1][1] - circl[0][1], 2));
		
		if(circl[1][2] + circl[0][2] == line || circl[1][2] + circl[0][2] < line) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}