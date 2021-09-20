package Day28; //// 백준에 올려서 맞은 코드로 올려주세요. 패키지문 때문에 런타임에러 남

import java.util.Scanner;

public class kcm_2440 {
	////꼼깔~ : 22 : 33 :4
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		String star = "";
		for(int i = 0; i < line; i++) {
			for(int j = line - i; j > 0; j--) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}

}
