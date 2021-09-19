package Day28;

import java.util.Scanner;

public class kcm_2440 {
	////꼼깔~
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
