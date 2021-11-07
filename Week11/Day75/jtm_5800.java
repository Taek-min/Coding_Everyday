import java.util.*;

public class Main {
	public static void main(String[] args) { //// 굳굳 : 2 :3
		Scanner sc = new Scanner(System.in);
		int group = sc.nextInt();
		for (int i = 1; i <= group; i++) {
			int student = sc.nextInt();
			int[] score = new int [student];
			for (int j = 0; j < student; j++) {
				score[j] = sc.nextInt();
			}
			Arrays.sort(score);
			int max = Integer.MIN_VALUE;
			
			for (int k = 0; k < student - 1; k++) {
				int min = score[k + 1] - score[k];
					if (min > max)
						max = min;
			}
			System.out.println("Class " + i);
			System.out.println("Max " + score[student - 1]+ ", Min " + score[0] +", Largest gap " + max);
		}
	}
}