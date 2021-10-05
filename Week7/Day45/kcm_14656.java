package Day45;

import java.util.Scanner;

public class kcm_14656 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		int nums[] = new int[amount];
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
			if(nums[i] != i+1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
