package Day14;

import java.util.Scanner;

//// 깔끔 : 2 나랑 거의 다 같아서 할말이없네
public class shm_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//// 오 변수명 잘 지었다
		int divisorOrder = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < num; i++) {
			//// i를 1부터 num까지로 하는건 어때 : 22 : 33 알겠습니다!
			if (num % (i + 1) == 0) {
				cnt++;
				if (cnt == divisorOrder) {
					System.out.println(i + 1);
				}
			}
		}
		if (cnt < divisorOrder) {
			System.out.println(0);
		}
	}
}
