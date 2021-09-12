package Day21;

import java.util.Scanner;

public class shm_5612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int givenTime = sc.nextInt();
		int existInTunnel = sc.nextInt();
		int maxInTunnel = existInTunnel;
		boolean exception = false;
		
		for(int i = 0; i < givenTime; i++) {
			int enterCar = sc.nextInt();
			int exitCar = sc.nextInt();
			
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