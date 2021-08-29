package Day7;

import java.util.Scanner;

public class shm_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int woman = sc.nextInt();
		int man = sc.nextInt();
		int internShip = sc.nextInt();
		
		for (int i = 0; i < internShip; i++) {
			if (woman / 2 >= man) {
				woman -= 1;
			}
			else {
				man -= 1;
			}
		}
		System.out.println(Math.min(woman/2, man));
	}

}
