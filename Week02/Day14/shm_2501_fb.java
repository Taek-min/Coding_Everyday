package Day14;

import java.util.Scanner;

public class shm_2501_fb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divisorOrder = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
				if (cnt == divisorOrder) {
					System.out.println(i);
				}
			}
		}
		if (cnt < divisorOrder) {
			System.out.println(0);
		}
	}
}
