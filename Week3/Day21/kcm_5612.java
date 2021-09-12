package Day21;

import java.util.Scanner;

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
			int outCar = in.nextInt();
			car -= outCar;
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
