package Day35;

import java.util.Scanner;
import java.util.Arrays;

public class kcm_2693 {
//// 깔끔 : 22 :3
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCount = in.nextInt();
		int nums[] = new int[10];
		for(int i = 0; i < testCount; i++) {
			for(int j = 0; j <10; j++ ) {
				nums[j] = in.nextInt();
			}
			Arrays.sort(nums);
			System.out.println(nums[7]);
		}
	}

}
