package Day25;

import java.util.Scanner;
import java.math.BigInteger;

public class shm_5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
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
