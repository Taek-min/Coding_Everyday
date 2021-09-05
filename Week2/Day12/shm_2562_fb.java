package Day12;

import java.util.Scanner;

public class shm_2562_fb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int order = 0;
		
		for (int i = 0;i < 9; i++) {
			int num = sc.nextInt();
			if (max < num) {
				max = num;
				order = i + 1;
			}
		}
		System.out.printf("%d\n%d", max, order);
	}
}
