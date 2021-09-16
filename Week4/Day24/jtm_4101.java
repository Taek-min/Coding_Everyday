import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 0;
		
		while(true) {
			first = sc.nextInt();
			second = sc.nextInt();
			
			if(first == 0 && second == 0) {
				break;
			}
			compareNum(first, second);
		}
	}
	
	//// 비교할뿐아니라 출력까지 하고있어서 printIfLeftIsBigger 등이 이름으로 적합 : 22 : 3 :4 함수 좋으네~
	static void compareNum(int first, int second) {
		if(first <= second) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}
