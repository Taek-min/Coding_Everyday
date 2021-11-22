package Day92;

import java.util.Scanner;

public class kcm_10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		int nums[] = new int[testCase];
		for(int i = 0; i < testCase; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		System.out.print(nums[0] + " " + nums[nums.length -1]);
	}

}
