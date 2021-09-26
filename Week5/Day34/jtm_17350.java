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
			//// ㄴ 바로 종료하면 끝까지 입력을 못받지않나요.
			if(name[i].equals("anj")) {
				result = true;
			}
		}
		if(result) {
			//// 이거 나만 물음표로 보이나,,, : 나도 이거 깨져서 보여 
			//// 나도 이거 깨져보여
			System.out.println("����;");
		}
		else {
			System.out.println("����?");
		}
	}
}
