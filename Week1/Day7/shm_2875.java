package Day7;

import java.util.Scanner;

public class shm_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int woman = sc.nextInt();
		int man = sc.nextInt();
		int internShip = sc.nextInt();
		
		////이거는 무슨 방법으로 푼거야??
		////:2 긍까 뭔가 심오한 수학적 고찰로 푼거같음 이해하기 좀 힘드네 
		//// 여자 2 남자 1 이 한 팀인데 여기서 남자든 여자든 internShip으로 한명은 빠져야 되는거 사용했습니다.
		////  잘 푼거 같아요.
		for (int i = 0; i < internShip; i++) {
			if (woman / 2 >= man) {
				woman -= 1;
			}
			else {
				man -= 1;
			}
		}
		System.out.println(Math.min(woman/2, man)); //// 배워갑니다.
	}

}
