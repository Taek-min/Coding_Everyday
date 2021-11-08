import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //// 너무 깔꼼하고 :2 : 3
		Scanner in = new Scanner(System.in);
		long nums[] = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		
		Arrays.sort(nums);
		if(nums[0] == nums[1]){
		    System.out.println(0);
		}
		else {
			System.out.println(nums[1] - nums[0] - 1);
			for(long i = nums[0] + 1; i < nums[1]; i++) {
				System.out.print(i + " ");
			}
		}
	}
}