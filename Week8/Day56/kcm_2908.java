import java.util.Scanner;

public class Main {
	public static void main(String[] args) {//// very good
		Scanner in = new Scanner(System.in);
		String firstNum = in.next();
		String secondNum = in.next();
		//// 구현 섬세하네~ : 2
		for(int i = firstNum.length() -1; i >= 0; i--) {
			if(firstNum.charAt(i) - '0' == secondNum.charAt(i) - '0') {
				continue;
			}
			else if(firstNum.charAt(i) - '0' > secondNum.charAt(i) - '0') {
				for(int j = firstNum.length() -1; j >= 0; j--) {
					System.out.print(firstNum.charAt(j));
				}
				break;
			}
			else {
				for(int k = secondNum.length() -1; k >= 0; k--) {
					System.out.print(secondNum.charAt(k));
				}
				break;
			}
		}
	}
}
