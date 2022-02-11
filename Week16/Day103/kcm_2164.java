package Day103;

import java.util.Scanner;


public class kcm_2164 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		for(int i =0; i <= 19; i++) {
			if(Math.pow(2,i) > num) {
				count = i -1;
				break;
			}
		}
		if(Math.pow(2, count) == num) {
			System.out.println(num);
		}
		else {
			System.out.println((int)(num - Math.pow(2, count)) * 2);
		}	
	}
}
// 거듭제곱으로 풀었네 bb
