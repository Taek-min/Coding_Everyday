import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt() + 1;
		int count = 0;
		BigInteger sum = new BigInteger("0");

		while(true) {
			int remain = k % 2;
			if(remain == 0) {
				sum = sum.add(BigInteger.valueOf(10).pow(count).multiply(BigInteger.valueOf(4)));
			}
			else if(remain == 1) {
				sum = sum.add(BigInteger.valueOf(10).pow(count).multiply(BigInteger.valueOf(7)));
			}
			count++;
			if(k / 2 == 1 || k == 0) {
				break;
			}
			else {
				k = k / 2;
			}
		}
		
		System.out.println(sum);
	}
}
// 베리 스마트해요
// 택민이꺼랑 비슷한데 한번에 넣어버렸네~? 잘했다!!!