import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int nums[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(nums);
		for( int i = nums[0]; i > 0; i--){
			if(nums[0] % i == 0 && nums[1] % i == 0) {
				min = i;
				break;
			}
		}
		max = nums[0] * nums[1] / min;
		System.out.println(min);
		System.out.println(max);
		
	}
}
////good! : 22 :3