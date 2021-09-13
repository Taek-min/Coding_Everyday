package Day21;

import java.util.Scanner;

public class shm_5612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		////변수명 지렸따,,,☆ :2 배워갑니단
		int givenTime = sc.nextInt();
		int existInTunnel = sc.nextInt();
		int maxInTunnel = existInTunnel;
		boolean exception = false;
		
		for(int i = 0; i < givenTime; i++) {
			int enterCar = sc.nextInt();
			int exitCar = sc.nextInt();
			
			////여기서 maxInTunnel값 0으로 바꿔주고 break시켜버려도 돼요!
			if(existInTunnel + enterCar < exitCar) {
				exception = true;
			}
			else {
				existInTunnel += enterCar;
				existInTunnel -= exitCar;
				if(maxInTunnel < existInTunnel) {
					maxInTunnel = existInTunnel;
				}
			}
		}
		if(exception) {
			System.out.println(0);
		}
		else {
			System.out.println(maxInTunnel);
		}
	}
}