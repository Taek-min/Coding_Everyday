import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { ////잘해~~
		Scanner in = new Scanner(System.in);
		Integer nums[] = new Integer[8];
		Integer num[] = new Integer[nums.length];
		Integer highIndex[] = new Integer[5];
		int sum = 0;

		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(in.nextLine());
			num[i] = nums[i];
		}
		Arrays.sort(num);
		
		for(int j = 0; j < 5; j++) {
			sum += num[num.length - (j + 1)];
			highIndex[j] = Arrays.asList(nums).indexOf(num[num.length - (j + 1)]);
		}
		
		Arrays.sort(highIndex);
		System.out.println(sum);
		for(int k = 0; k < highIndex.length; k++) {
			System.out.print(highIndex[k] + 1 + " ");
		}
	}
}
