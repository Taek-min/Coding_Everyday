package Day15;

import java.util.Scanner;

public class shm_2153 { //// 나랑 그냥 코드가 똑같네.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int sumOfConvertNum = 0;
		int cnt = 1;
		
		for (int i = 0; i < word.length(); i++) {
			//// 이름 지어준거 굳!!
			boolean smallLetter = word.charAt(i) >= 'a' && word.charAt(i) <= 'z';
			if (smallLetter) {
				sumOfConvertNum += word.charAt(i) - 96;
			}
			else {
				sumOfConvertNum += word.charAt(i) - 38;
			}
		}
		//// 2부터 돌리고 나눠지는거 찾았을 때 바로 종료시키면 for문돌리는 횟수 줄일 수 있어요!
		for (int i = 1; i < sumOfConvertNum; i++) {
			if (sumOfConvertNum % i == 0) {
				cnt += 1;
			}
		}
		//// 0이거나 음수일 경우는 없으니 <= 2 해도 괜춘
		if (cnt == 2 || cnt == 1) {
			System.out.println("It is a prime word.");
		}
		else {
			System.out.println("It is not a prime word.");
		}
	}

}
