import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		in.nextLine();
		int nums[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //이거 좋네 오랜만에 본다 : 멋져요 
		Arrays.sort(nums);
		int max = nums[0] + 1;
		
		for(int i = amount - 1; i >= 0; i--) {
			if(max <= nums[i] + amount - i) {
				max = nums[i] + amount - i;
			}
		}
		
		System.out.println(max + 1);
	}
}

