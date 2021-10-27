package Day11;

import java.util.Scanner;

public class shm_2747_fb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int result = 0;
		
		int firstNum = 0;
		int lastNum = 1;
		
		for (int i = 1; i < loop; i++) {
			result = firstNum + lastNum;
			firstNum = lastNum;
			lastNum = result;
		}
		
		System.out.println(lastNum);
	}
}
