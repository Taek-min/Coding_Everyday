import java.util.*;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int L = in.nextInt();
		int ball = 0;
		
		int[] cnt = new int[N];
	    cnt[0] = 1;
	    
		while(true) {
			if(cnt[ball] == M) {
				break;
			}

			if(cnt[ball] % 2 == 1) {
				ball += L;
				if(ball >= N) {
					ball -= N;
				}
			} else {
				if(ball < L) {
					ball = ball + N - L;
				} else {
					ball -= L;
				}
			}
			cnt[ball]  = cnt[ball] + 1;
		}

		System.out.println(IntStream.of(cnt).sum() - 1);
	}
}