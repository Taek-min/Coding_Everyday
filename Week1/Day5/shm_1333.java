package Day5;
		
import java.util.Scanner;		

public class shm_1333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 문제 입력이 하나가 아니라 여러개면 N, L, D처럼 문제에서 지어준 이름 그대로 쓰기보다는
    //// songAmount 식으로 지어주는게 훨씬 가독성이 나음
		int N = sc.nextInt();
		int L = sc.nextInt();
		int D = sc.nextInt();
		//// cmp라는 이름으론 변수의 의도를 알기 어려움 : 2
		int cmp = 0;
		//// 공식 활용을 잘 한거 같아요
		for (int i = 0; i < N; i++) { 
			//// (i*(L+5)+L) 같은 복잡한 수식에 canHearStart, canHearEnd처럼 이름을 붙여주면 가독성이 훨씬 좋아짐!:2
			for (int t = (i*(L+5)+L); t < (i+1)*(L+5); t++) {
				//// 변수 작명, 함수 작명등으로 코드의 의도를 최대한 설명해보고 정말 불가피할때 다는게 주석임 (이외에는 안 다는게 좋음)
				//// 주석 대신에 let isHeardTheRingtone = t % d == 0; 식으로 변수 이름으로 나타내주면 더 좋을듯
				if(t % D == 0) {	// 간주와 알람 일치 시 
					cmp = t;
					break;
				}
			}
			if(cmp != 0)
				break;
		}

		//// 이것도 변수 이름을 heardTimeBeforeSongEnd 등으로 충분히 표현 가능
		if (cmp == 0) //앨범이 끝나고도 못들음
			System.out.println(N * (L + 5) - 5 + D - (N * (L + 5) - 5) % D);
		else
			System.out.println(cmp);
		}
}
