package Day26;

import java.util.Scanner;

public class shm_11365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String reverseSentence = sc.nextLine();
			StringBuilder sentence = new StringBuilder();
			
			if(reverseSentence.equals("END")) {
				break;
			}
			//// 정직한 구현 굿굿:22 이게 알고리즘의 정석이 아닌가~ :3
			for(int i = reverseSentence.length() - 1; i >= 0; i--) {
				sentence.append(reverseSentence.charAt(i)); //// 배워갑니다.
			}
			System.out.println(sentence);
		}
	}
}
