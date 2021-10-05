import java.util.Scanner;
import java.util.Arrays;

public class kcm_3047 {//// 다 비슷하구나 good good  : 22
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
			if(abc.charAt(j) == 'A') {
				System.out.print(nums[0]);
			}
			else if(abc.charAt(j) == 'B') {
				System.out.print(nums[1]);
			}
			else if(abc.charAt(j) == 'C') {
				System.out.print(nums[2]);
			}
			System.out.print(" ");
		}	
	}
}
// 멋져~:22
