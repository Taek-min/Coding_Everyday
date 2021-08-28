package baekjoon;

import java.util.Scanner;

public class kcm_fb_5086 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			if (num1 == num2) {break;}
			else if(num2 % num1 == 0) {
				System.out.println("factor");
			}
			else if(num1 % num2 == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
	}
}

//// 인코딩 문제인거같은데 한글 깨져서 안 보여
// �ڹٿ��� �ѹ��� �ΰ��� �Է¹������� ������ �ؾߵǴ��� ���� �˾ҽ��ϴ� ^0^ - ����
// 나도 ↑이거 깨져서 무슨 말인지 안보인다. - 창민
