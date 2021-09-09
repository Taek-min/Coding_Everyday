package Day17;

import java.util.Scanner;

public class kcm_3060 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pigs[] = new int[6];
		int testAmount = in.nextInt();
		for(int i = 0; i < testAmount; i++) {
			int feed = in.nextInt();
			//// reFeed(먹이 다시), allFeed(먹이 전부) 변수명으로 뭘 말하고 싶은지 잘 모르겠어요.
			//// 다른 분들 변수명 작명 참고해서 좀 더 명확하게 바꿔보시면 좋을 것 같습니다
			int reFeed = feed;
			int allFeed = 0;
			int days = 1;
			for(int j  = 0; j < pigs.length; j++) {
				pigs[j] = in.nextInt();
				allFeed += pigs[j];
			}
			//// day 변수는 for문 밖에서 사용하지 못하니까 나중에 출력하기 위한 용도로 days 변수를 만든거 같은데, 고냥 for문 밖에서 day를 선언하면 for문 밖에서 사용할 수 있습니다
			for(int day = 1; feed >= 0; day++) {
				feed = reFeed;
				if(day == 1) {
					feed -= allFeed;
					continue;
				}
				feed =  feed - (int)(allFeed * Math.pow(4, day-1)) ; ////제곱근으로 푸셨고만 Math.pow 알아갑니당
				days = day;			
			}
			System.out.println(days);
		}	
	}
}
