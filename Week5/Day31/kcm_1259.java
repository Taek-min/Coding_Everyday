import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			//// 피드백 남긴거 잘 활용해주니까 뿌듯하네요
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
