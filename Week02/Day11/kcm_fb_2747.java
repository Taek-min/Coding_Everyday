package Day11;

import java.util.Scanner;

public class kcm_fb_2747 {
	public static void main(String[] args) {	////GOOD!
	    Scanner in = new Scanner(System.in);
		//// 배열 없이도 구현할 수 있지 않나요? :22
		//// 무조건 45번 돌리게 한 부분이 아쉽네요 :22
	    int result;
	    int firstNum = 0;
	    int secondNum = 1;
	    int location = in.nextInt();
	    for(int i = 1; i < location; i++) {
	    	result = firstNum + secondNum;
	    	firstNum = secondNum;
	    	secondNum = result;
	    }
	    System.out.println(secondNum);
	}
}