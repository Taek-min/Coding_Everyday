import java.util.Scanner;

//// 굿 : 22 :3
public class kcm_14656 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		int nums[] = new int[amount];
		int count = 0; //// 이 아래같은데에 줄바꿈 하나씩 넣으면 읽기 좋을 것 같아요
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
			if(nums[i] != i+1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
