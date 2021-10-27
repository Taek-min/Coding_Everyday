package Day21;

import java.util.Scanner;
////코드 구성이 비슷하네요 ㅎㅎ good
public class kcm_fb_5612 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCount = in.nextInt();
		int nowCar = in.nextInt();
		int car = nowCar;
		int max = nowCar;
		boolean iscar  = true;
		for(int i = 0; i < testCount; i++) {
			int enterCar = in.nextInt();
			int outCar = in.nextInt();
			car += enterCar;
			car -= outCar;
			//// 여기서 그냥 max를 0으로 해주고 break해주는 방법도 있어요! 
			//// ㄴ 이러면은 예제 입력2에서 마지막 4  1 입력이 안되서 틀렸다고 나올줄알고 안햇는데 되네 ?
			if(car < 0) {
				max = 0;
				break;
			}
			if(max < car) {
				max = car;
			}
		}
		System.out.println(max);
	}
}
