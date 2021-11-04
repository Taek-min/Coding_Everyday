import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int classes = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < classes; i++) {
			int nums[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int interval = 0;
			
			Arrays.sort(nums, 1, nums.length);
			
			for(int j = 1; j < nums[0]; j++) {
				if(nums[j + 1] - nums[j] > interval) {
					interval = nums[j + 1] - nums[j];
				}
			}
			
			System.out.println("Class " + (i + 1));
			System.out.println("Max " + nums[nums.length - 1] + ", Min " + nums[1] + ", Largest gap " + interval);
		}
	}
}