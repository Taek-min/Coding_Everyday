package Day22;

import java.util.Scanner;

public class kcm_1924 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();
		int sum = 0;
		String week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for(int i = 1; i <= month; i++) {
			if(i == month) {
				break;
			}
			//// 노력파 코딩이네? ㅋㅋㅋㅋ : 22ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ노력이 가상해서 뭐라 말을 모하겠네
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 ) {////ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ :2ㅋㅋ
				sum += 31;
			}
			else if(i == 4 || i == 6 || i == 9 || i == 11){
				sum += 30;
			}
			else {
				sum += 28;
			}
		}
		System.out.println(week[(day + sum) % 7]);
	}

}
