package Day31;

import java.util.Scanner;
import java.util.Arrays;

public class kcm_1259 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int[] nums = Arrays.stream(in.next().split("")).mapToInt(Integer::parseInt).toArray();
			int count = 0;
			if(nums[0] == 0) {
				break;
			}
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] != nums[nums.length - (1 +i)]) {
					System.out.println("no");
					break;
				}
				count++;
			}
			if(count == nums.length) {
				System.out.println("yes");
			}	
		}
	}
}
