import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		int[] nums = new int[testCase];
		int count = 0;
		
		for(int i = 0; i < testCase; i++) {
			int num = in.nextInt();
			if(num == 0) {
				nums[count-1] = 0;
				count--;
				
			}
			else {
				nums[count] = num;
				count++;
			}
		}
		
		System.out.println(IntStream.of(nums).sum());
	}
}
// 너무 잘하고
