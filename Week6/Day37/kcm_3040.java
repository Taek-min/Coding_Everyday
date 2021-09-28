import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums[] = new int[9];
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
			sum += nums[i];
		}
		for(int i = 0; i < nums.length; i++) {
			for(int j = nums.length-1; j>i; j-- ) {
				if(sum - (nums[i] + nums[j]) == 100) {
					nums[i] = 0;
					nums[j] = 0;
					i = nums.length-1;
					break;
				}
			}
		}
		for(int a = 0; a < nums.length; a++) {
			if(nums[a] != 0) {
				System.out.println(nums[a]);
			}
		}
	}
}
