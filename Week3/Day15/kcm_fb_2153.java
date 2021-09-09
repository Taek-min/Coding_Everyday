package Day15;

import java.util.Scanner;

//// 깔끔
public class kcm_fb_2153 {	//나랑 머리 공유하지 창민 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int sum = 0;
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			if('a' <= name.charAt(i) && name.charAt(i) <='z') {
				//// - 96말고 - 'A'로 써도 돼요
				sum = sum + name.charAt(i) - 96;
			}
			else {
				sum = sum + name.charAt(i) - 38;
			}
		}
		////2부터 sum보다 작을때까지만 돌리면 찾고 바로 종료시켜줄 수 있어서 for문 돌리는 횟수 줄일 수 있어요!
		for(int j = 2; j < sum; j++) {
			if(sum %  j == 0) {
				count++;
				break;
			}
		}
		if(count == 0 ) {
			System.out.println("It is a prime word.");
		}
		else {
			System.out.println("It is not a prime word.");
		}
		
	}

}
