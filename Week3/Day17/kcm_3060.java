package Day17;

import java.util.Scanner;

public class kcm_3060 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pigs[] = new int[6];
		int testAmount = in.nextInt();
		for(int i = 0; i < testAmount; i++) {
			int feed = in.nextInt();
			int reFeed = feed;
			int allFeed = 0;
			int days = 1;
			for(int j  = 0; j < pigs.length; j++) {
				pigs[j] = in.nextInt();
				allFeed += pigs[j];
			}
			for(int day = 1; feed >= 0; day++) {
				feed = reFeed;
				if(day == 1) {
					feed -= allFeed;
					continue;
				}
				feed =  feed - (int)(allFeed * Math.pow(4, day-1)) ;
				days = day;			
			}
			System.out.println(days);
		}	
	}
}
