package algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	////굿굿굿
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int[] nums = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
			
			String result = ((nums[nums.length-1]) % 2 == 0) ? "even" : "odd" ;
			System.out.println(result);
		}
	}
}
