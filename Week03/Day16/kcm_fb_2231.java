package Day16;

import java.util.Scanner;

public class kcm_fb_2231 {////깔꼼하게 잘짜셨네요 ㅎ : 22 : 33

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = in.nextInt();
		for(int i = 1; i <= result; i++) {
			int sum = 0;
			//// strNumber(문자열로 다루는 수), eachDigit(각 자리수) 정도 추천합니다
			String strNumber = Integer.toString(i); //변수를 뭐라해야할지 모르겟스빈다.
			String eachDigit[] = strNumber.split("");     //변수를 뭐라해야할지 모르겟스빈다. 
			for(int j = 0; j < eachDigit.length; j++) {
				sum += Integer.parseInt(eachDigit[j]);
			}
			if(i + sum == result) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

}
