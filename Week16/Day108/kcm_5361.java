import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		in.nextLine();

		for(int i = 0; i < testCase; i++) {
			double sum = 0;
			int nums[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			sum += nums[0] * 350.34;
			sum += nums[1] * 230.90;
			sum += nums[2] * 190.55;
			sum += nums[3] * 125.30;
			sum += nums[4] * 180.90;
			System.out.printf("$%.2f\n",sum);
		}
	}
}
