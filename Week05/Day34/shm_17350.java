import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int memberNum = sc.nextInt();
		boolean anjFind = false;
		for(int i = 0; i < memberNum; i++) {
			String name = sc.next();
			//// 왜 셋이 콛으 다 똑같ㅌ은거같지,,,, 찾고 바로 종료해주는게 좋을ㄷ스??? : 무조건 선수이름 다 입력받아야되는줄 알구 그랬는데 break써도 정답이네용 반영하겠습니다~ 
			if(name.equals("anj")) {
				anjFind = true;
			}
		}
		if(anjFind) {
			System.out.println("뭐야;");
		}
		else {
			System.out.println("뭐야?");
		}
	}
}
//// 굳. :2 : 33
