import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int score = sc.nextInt();
		int P = sc.nextInt();
		int rank[] = new int [51];
		int cnt = 0;
		int ranking = 1;
		
		for (int i = 0; i < N; i++) {
			rank[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (score < rank[i]) {
				ranking += 1;
			}
			else if(score == rank[i]) {}
			else { break; }
			cnt++;
		}
		
		if (cnt == P) ranking = -1;
		if (N == 0) ranking = 1;
		
		System.out.println(ranking);
	}
}
