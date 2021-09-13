package Day21;

import java.util.Scanner;
////코드 구성이 비슷하네요 ㅎㅎ good
public class kcm_5612 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCount = in.nextInt();
		int nowCar = in.nextInt();
		int car = nowCar;
		int max = nowCar;
		boolean iscar  = true;
		for(int i = 0; i < testCount; i++) {
			int enterCar = in.nextInt();
			car += enterCar;
			//// 무슨느낌인지는 알겠는데 입력을 나눠서 받을 필요는 없을듯
			int outCar = in.nextInt();
			car -= outCar;
			//// 여기서 그냥 max를 0으로 해주고 break해주는 방법도 있어요!
			if(car < 0) {
				iscar = false;
			}
			if(max < car) {
				max = car;
			}
		}
		if(iscar) {
			System.out.println(max);
		}
		else {
			System.out.println(0);
		}
	}

}
