package Day16;

import java.util.Scanner;

//// 깔끔 :22 : 3 : 44
public class shm_2231_fb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int numLength = num.length();
		int sumDisassemble = Integer.parseInt(num);
		int constructor = 0;
		
		for (int i = sumDisassemble - (numLength*9); i < sumDisassemble - (numLength); i++) {
			int sum = 0;
			int saveNum = i;
			for (int j = 1; j <= numLength; j++) {
				sum += (saveNum % 10);
				saveNum /= 10;
			}
			if (sumDisassemble == sum + i) {
				constructor = i;
				break;
			}
		}
		System.out.println(constructor);
	}
}
