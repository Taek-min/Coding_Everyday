import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { ////굳굳 :2
		Scanner sc = new Scanner(System.in);
		int gcd = 0, lcm = 0;
			int nums[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(nums);
			for( int j = nums[0]; 0 < j; j--){
				if(nums[0] % j == 0 && nums[1] % j == 0) {
					gcd = j;
					break;
				}
			}
			lcm = nums[0] * nums[1] / gcd;
			System.out.println(gcd);
			System.out.println(lcm);
	}
}


