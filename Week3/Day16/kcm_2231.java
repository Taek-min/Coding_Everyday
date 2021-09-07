package Day16;

import java.util.Scanner;

public class kcm_2231 {////깔꼼하게 잘짜셨네요 ㅎ 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = in.nextInt();
		for(int i = 1; i <= result; i++) {
			int sum = 0;
			String number = Integer.toString(i); //변수를 뭐라해야할지 모르겟스빈다.
			String num[] = number.split("");     //변수를 뭐라해야할지 모르겟스빈다. 
			for(int j = 0; j < num.length; j++) {
				sum += Integer.parseInt(num[j]);
			}
			if(i + sum == result) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

}
