import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputCase = sc.nextInt();
		String[] name = new String[inputCase+1];
		boolean result = false;
		for(int i = 0; i <= inputCase; i++) {
			name[i]  = sc.nextLine();
			//// 찾고 바로 종료해주는 것도 좋을듯?
			//// ㄴ 바로 종료하면 끝까지 입력을 못받지않나요. => ㄴㄴ anj가 하나라도 있는걸 알게되면 나머지 입력 안 받아도 상관없음
			if(name[i].equals("anj")) {
				result = true;
				break;
			}
		}
		if(result) {
			//// 이거 나만 물음표로 보이나,,, : 나도 이거 깨져서 보여 
			//// 나도 이거 깨져보여 :22 인코딩 UTF-8로 부탁
			System.out.println("뭐야;");
		}
		else {
			System.out.println("뭐야?");
		}
	}
}
