package Day37;

import java.util.Scanner;

public class kcm_fb_3040 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums[] = new int[9];
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {//.length하나 배워갑니다~
			nums[i] = in.nextInt();
			sum += nums[i];
		}
		Loop1:
		for(int i = 0; i < nums.length; i++) {
			Loop2:
			for(int j = nums.length-1; j>i; j-- ) {
				if(sum - (nums[i] + nums[j]) == 100) {
					nums[i] = 0;
					nums[j] = 0;
					//// 다중 for문 곧바로 break 할 수 있습니다. 링크 참조하십쇼 https://ifuwanna.tistory.com/269
					break Loop1;
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
//// 뭘 실수했다는건지 난 못찾겠음
//// 올 아이디어 괜찮네/