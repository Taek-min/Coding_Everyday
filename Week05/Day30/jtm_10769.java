import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int check = 0;
		int smile = 0;
		int sad = 0;
		
		//// char인데 이름은 웨 string
		for(char inputString : str.toCharArray()) {	//// 향상된 for문 Good 코드 재밌네 : 22 우와ㅏ 이걸 이렇게,,,?? 신기하넿ㅎ :3
			if (inputString == ':' || (inputString == '-') && check == 1) {
				check++;
				continue;
			}
			else if(check == 2) {
				if(inputString == '(') {
					sad++;
				}
				else if(inputString ==')') {
					smile++;
				}
			}
			check = 0;
		}
		
		int difference = smile - sad;
		if(difference == 0) {
			if(smile == 0) System.out.println("none");
			else System.out.println("unsure");
		}
		else System.out.println(difference > 0 ? "happy" : "sad");
	}
}
