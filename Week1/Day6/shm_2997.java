package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class shm_2997 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[3];
		
		for (int i = 0;i < num.length;i++) {
			int input = sc.nextInt();
			num[i] = input;
		}
		
		Arrays.sort(num);
		
		int cmp1 = num[1] - num[0];
		int cmp2 = num[2] - num[1];
		
		if (cmp1 == cmp2) {
			System.out.println(num[2] + cmp1);
		}
		else
			if (cmp1 > cmp2) {
				System.out.println(num[0] + cmp2);
			}
			else
				System.out.println(num[2] - cmp1);
	}
}