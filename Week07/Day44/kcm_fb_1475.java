import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		double nums[] = new double[9];
		
		for(int i =0; i < num.length(); i++) {
			if(num.charAt(i)-'0' == 9) {
				nums[6]++;
			}
			else {
				nums[num.charAt(i) -'0']++; //신기하네..
			}
		}
		nums[6] = Math.ceil(nums[6] / 2);
		double max = nums[0];
		for(int j = 0; j<nums.length; j++) {
			//// 쉬프트탭해주새요 -> 해주'세'요.
			if(nums[j] > max) {
				max = nums[j];
			}
		}
		System.out.println((int)max);
	}
}
////꿋 : 2 : 3 : 4