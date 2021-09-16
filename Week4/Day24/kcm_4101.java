package Day24;

import java.util.Scanner;
////ㅋㅋㅋㅋㅋㅋㅋ줄바꿈빼면 깔꼼~
public class kcm_4101 {

	//// 이런곳 불필요한 줄바꿈 노노 : ㅋㅋ : ㅎㅎ
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int firstNum = in.nextInt();
			int secondNum = in.nextInt();
			if(firstNum == 0 && secondNum ==0) {
				break;
			}
			if(firstNum > secondNum) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}				
		}
		
		//// 이런곳 불필요한 줄바꿈 노노 : ㅋㅋ : ㅎㅎ
	}

	//// 이런곳 불필요한 줄바꿈 노노 : ㅋㅋ :ㅎㅎ
}
