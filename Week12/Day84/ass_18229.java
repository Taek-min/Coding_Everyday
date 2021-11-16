import java.util.*;

public class Main {
	public static void main(String[] args) { //잘해잘해~
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int num[][] = new int[N][M];
		int stretch[] = new int[N];

		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				num[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++){
				stretch[j] += num[j][i];
				
				if(K <= stretch[j]){
					System.out.println((j + 1) + " " + (i + 1));
					return;
				}
			}
		}
	}
}