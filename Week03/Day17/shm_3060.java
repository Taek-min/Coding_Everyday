package Day17;

import java.util.Scanner;

public class shm_3060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 테스트케이스 수라서 feedNum은 약간 부적절한듯요? 정직하게 testCases 해도 괜찮을 것 같습니다
		int feedNum = sc.nextInt();
		int pig[] = new int[6];
		
		for (int i = 1; i <= feedNum; i++) {
			int totalFeed = 0;
			int day = 1;
			int dailyFeed = sc.nextInt();
	
			for (int j = 0; j < pig.length; j++) {
				pig[j] = sc.nextInt();
				totalFeed += pig[j];
			}
			while(true) {
				//// 아래 조건을 while 종료 조건으로 바꿔서 if문을 없애고, 나중에 day를 출력하면 더욱 깔끔할 것 같아요 : 2 : 35 : 44
				if (totalFeed > dailyFeed) {
					System.out.println(day);
					break;
				}
				else {
					totalFeed = totalFeed * 4;
					day += 1;
				}
			}
		}
	}
}