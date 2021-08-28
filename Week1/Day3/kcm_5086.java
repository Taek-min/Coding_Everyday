package baekjoon;

import java.util.Scanner;

public class kcm_5086 {

	public static void main(String[] args) {
		//// 필요없는 주석은 제거 : 222222
		Scanner in = new Scanner(System.in);
		//// 12줄에 탭 왜 했어
		while(true) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			if (num1 == num2)
				break;
			else if(num2 % num1 == 0)
				System.out.println("factor");
			else if(num1 % num2 == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}
	}
}

//// 인코딩 문제인거같은데 한글 깨져서 안 보여
// 수정했습니당, 덕분에 자바 한번에 입력하는거 알아갑니다 ^0^ - 현민
//// 나도 ↑이거 깨져서 무슨 말인지 안보인다. - 창민
