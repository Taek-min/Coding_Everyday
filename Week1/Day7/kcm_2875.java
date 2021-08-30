package Day7;
import java.util.Scanner;
public class kcm_2875 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int woman = in.nextInt();
		int man = in.nextInt();
		int internship = in.nextInt();
		
		//// 오 이거 좀 깐지나네?
		for(int i = 1; ; i++) {
			woman -= 2;
			man -= 1;
			if(man+ woman < internship) {
				System.out.println(i -1);
				break;
			}
			if(woman < 2 || man < 1) {
				System.out.println(i);
				break;
			}
		}
	}
//덕분에 제 시간에 해결했습니다~ 변수이름 다 똑같애서 놀람
}
