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
			//// ㄴ 숫자 한개씩 점점 올리면서 비교하는 숫자랑 차가 가까운걸 찾으려고 넣었습니다. 
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
