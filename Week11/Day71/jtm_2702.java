import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) { ////굳굳
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();
		int gcd = 0, lcm = 0; //gcd == 최대 공약수, lcm == 최소 공배수 : 저랑 변수명이 같네요 

		for(int i = 0; i < testcase; i++) {
			int nums[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(nums);
			for( int j = nums[0]; 0 < j; j--){
				if(nums[0] % j == 0 && nums[1] % j == 0) {
					gcd = j;
					break;
				}
			}
			lcm = nums[0] * nums[1] / gcd;
			System.out.println(lcm + " " + gcd);
		}
	}
}
