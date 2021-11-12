import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		int[][] apart = new int[15][15];
		for(int i = 0; i < apart.length; i++) {
			apart[i][1] = 1;
			apart[0][i] = i;
		}
		for(int i = 1; i < apart.length; i++) {
			for(int j = 2; j < apart.length; j++) {
				apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
			}
		}
		
		for(int i = 0; i < testCase; i++) {
			int floor = sc.nextInt();
			int ho = sc.nextInt();
			System.out.println(apart[floor][ho]);
		}
	}
}