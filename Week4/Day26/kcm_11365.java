package Day26;

import java.util.Scanner;

public class kcm_11365 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			String sentence = in.nextLine();
			String reverse = "";
			if(sentence.equals("END")) {
				break;
			}
			//// 정직한 구현 굿굿:22이게 알고리즘 정석이 아닌가~
			for(int i = sentence.length()-1; i >= 0; i--) { //// 아 이게 이렇게 되네.. 배워갑니당
				reverse += sentence.charAt(i);
			}
			System.out.println(reverse);
		}
	}
}
