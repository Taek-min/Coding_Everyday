import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //결제할 인원
		int M = in.nextInt(); //
		int K = in.nextInt(); //점원과의 거리
		int[][] A = new int[N][M];
		int[] distance = new int[N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				A[i][j] = in.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				distance[j] += A[j][i];
				
				if(distance[j] >= K) {
					System.out.println((j + 1) + " " + (i + 1));
					return;
				}
			}
		}
	}
}