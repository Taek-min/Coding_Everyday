package Day17;

import java.util.Scanner;

public class shm_3060_fb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int pig[] = new int[6];
		
		for (int i = 1; i <= testCases; i++) {
			int totalFeed = 0;
			int day = 1;
			int dailyFeed = sc.nextInt();
	
			for (int j = 0; j < pig.length; j++) {
				pig[j] = sc.nextInt();
				totalFeed += pig[j];
			}
			while(totalFeed <= dailyFeed) {
				totalFeed = totalFeed * 4;
				day += 1;
			}
			System.out.println(day);
		}
	}
}