import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer N = in.nextInt();
		Integer score = in.nextInt();
		Integer P = in.nextInt();
		in.nextLine();
		
		if(N > 0) {
			Integer[] scoreList = new Integer[N + 1];
			Integer[] scoreListCopy = new Integer[N];
			for(int i = 0; i < N; i++) {
				scoreList[i] = in.nextInt();
				scoreListCopy[i] = scoreList[i];
			}
			
			scoreList[N] = score;
			Arrays.sort(scoreList, Collections.reverseOrder());
			
			if(N < P) {
				System.out.println(Arrays.asList(scoreList).indexOf(score) + 1);
			} else if(N >= P) {
				if(scoreList[P - 1] == scoreListCopy[P - 1]) {
					System.out.println("-1");
				} else {
					System.out.println(Arrays.asList(scoreList).indexOf(score) + 1);
				}
			}
		} else {
			System.out.println("1");
		}
	}
}