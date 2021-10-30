import java.util.*;

public class Main {
	public static void main(String[] args) {//// 깔끔 잘해
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			String squareN = Integer.toString(N * N);
			
			if(Integer.toString(N).equals(squareN.substring(squareN.length() - Integer.toString(N).length(), squareN.length()))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}
}