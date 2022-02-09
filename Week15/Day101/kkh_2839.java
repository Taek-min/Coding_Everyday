import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0;
		
		while(N > 2) {
			if(N % 5 == 0) {
				cnt += N / 5;
				N = 0;
			} else {
				cnt++;
				N -= 3;
			}
		}
			
		if(N == 0) {
			System.out.println(cnt);
		} else {
			System.out.println("-1");
		}
	}
}
// 나랑 비슷하게 풀었네 ~~ 