package Day23;

import java.util.Scanner;////Good :2

public class kcm_4619 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int num = in.nextInt();
			int square = in.nextInt();
			int min = num - (int)Math.pow(1, square);
			int nearNum = 1;
			if(num == 0 && square == 0) {
				break;
			}
			////이거는 왜 돌아가는거야?
			for(int i = 2; i <= num; i++) {
				if(min >= (int)Math.abs(num - Math.pow(i, square))) {
					min = (int) Math.abs(num - Math.pow(i, square));
					nearNum = i;
				}
			}
			System.out.println(nearNum);
		}
	}
}
