package Day5;
		
import java.util.Scanner;		

public class shm_1333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 문제 입력이 하나가 아니라 여러개면 N, L, D처럼 문제에서 지어준 이름 그대로 쓰기보다는
    //// songAmount 식으로 지어주는게 훨씬 가독성이 나음
		int songAmount = sc.nextInt();
		int songlength = sc.nextInt();
		int delay = sc.nextInt();
		//// cmp라는 이름으론 변수의 의도를 알기 어려움 : 2
		int comepare = 0;
		//// 공식 활용을 잘 한거 같아요
		for (int i = 0; i < songAmount; i++) { 
			//// (i*(L+5)+L) 같은 복잡한 수식에 canHearStart, canHearEnd처럼 이름을 붙여주면 가독성이 훨씬 좋아짐!:2
			for (int t = (i * (songlength + 5) + songlength); t < (i + 1) * (songlength + 5); t++) {
				//// 변수 작명, 함수 작명등으로 코드의 의도를 최대한 설명해보고 정말 불가피할때 다는게 주석임 (이외에는 안 다는게 좋음)
				//// 주석 대신에 let isHeardTheRingtone = t % d == 0; 식으로 변수 이름으로 나타내주면 더 좋을듯
				if(t % delay == 0) {
					comepare = t;
					break;
				}
			}
			if(comepare != 0)
				break;
		}

		//// 이것도 변수 이름을 heardTimeBeforeSongEnd 등으로 충분히 표현 가능
		if (comepare == 0)
			System.out.println(songAmount * (songlength + 5) - 5 + delay - (songAmount * (songlength + 5) - 5) % delay);
		else
			System.out.println(comepare);
		}
}
