import java.util.Scanner;
import java.util.Arrays;

public class Main {//// 다 비슷하구나 good good  : 22
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums[] = new int[3];

		for(int i = 0 ; i < 3; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		in.nextLine();
		String abc = in.nextLine();
		
		for(int j = 0; j < 3; j++) {
			//// if 없이 num[str.charAt(i) - 'A'] 출력해도 됨
			System.out.printf(nums[abc.charAt(j) - 'A'] + " ");
		}	
	}
}
// 멋져~
