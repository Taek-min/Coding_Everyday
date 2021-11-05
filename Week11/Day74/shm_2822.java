import java.util.*;

public class Main {
	public static void main(String[] args) {//// 다들 비슷하게 풀었네 : 2 : 3
		Scanner sc = new Scanner(System.in);
		int[] score = new int[8];
		int[] min = new int[3];
		int[] index = new int[5];
		int indexNum = 0;
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		int[] scoreCopy = Arrays.copyOf(score, 8);
		Arrays.sort(scoreCopy);
		
		for(int i = 0; i < min.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(scoreCopy[i] == score[j]) {
					min[i] = j;
				}
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			if(i == min[0] || i == min[1] || i == min[2]) {
				continue;
			}
			sum += score[i];
			index[indexNum++] = i + 1;
		}
		System.out.println(sum);
		
		for(int i = 0; i < index.length; i++) {
			System.out.printf("%d ", index[i]);
		}
	}
}