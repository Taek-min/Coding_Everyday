package Day14;

import java.util.Scanner;

public class shm_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divisorOrder = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < num; i++) {
			if (num % (i + 1) == 0) {
				cnt++;
				if (cnt == divisorOrder) {
					System.out.println(i + 1);
				}
			}
		}
		if (cnt < divisorOrder) {
			System.out.println(0);
		}
	}
}
