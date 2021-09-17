package Day25;

import java.util.Scanner;
import java.math.BigInteger;

public class shm_5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		//// 원래 BigInteger 쓰라는 의도의 문제였던거같은데 홀짝만 확인하면 되니 Integer로도 어쩌다보니 됐고 다들 그걸로 해결봤네요
		//// 정직한 구현 굿이요~
		for(int i = 1; i <= loop; i++) {
			BigInteger num = sc.nextBigInteger();
			BigInteger q = new BigInteger("2");
			BigInteger p = new BigInteger("0");
			System.out.println(num.remainder(q));
			if(num.remainder(q).equals(p)) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}
}
