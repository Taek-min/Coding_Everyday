package Day32;

import java.util.Scanner;

public class kcm_fb_8595 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Length = in.nextInt();
		in.nextLine();
		String code = in.nextLine();
		long hiddenNum = 0;
		String num = "";
		for(int i = 0; i < Length; i++) {
			if('0' <= code.charAt(i) && code.charAt(i) <= '9') {
				num += code.charAt(i);
				if(i == Length-1) {
					for(int j = 0; j < num.length(); j++) {
						hiddenNum += (num.charAt(j) - '0') * Math.pow(10, num.length()-(1 + j));
					}
				}
			}
			else {
				////이 코드가 두번 들어가지 않게 하는 방법이 있지 않을까? :22  
				//// ㄴ 어케해야할지 도저히 모르겟으.
				for(int j = 0; j < num.length(); j++) {
					hiddenNum += (num.charAt(j) - '0') * Math.pow(10, num.length()-(1 + j));
				}
				num = "";
			}
		}
		System.out.println(hiddenNum);
	}
}
