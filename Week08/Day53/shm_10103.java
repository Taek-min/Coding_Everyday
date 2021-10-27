import java.util.Scanner;

public class Main { //// 패키지 바꿔드렸습니다. 코드가 똑같네 : 아구구잘해해해~~ :에고고잘해해해해~~~ : 정신나간사람이 두명있네
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int jeongSou = 100;
		int sangDeok = 100;
		
		for(int i = 0; i < loop; i++) {
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			
			if(firstNum > secondNum) {
				sangDeok -= firstNum;
			}
			else if(firstNum < secondNum) {
				jeongSou -= secondNum;
			}
			else {
				continue;
			}
		}
		System.out.println(jeongSou); //이거 한번에 쓰는 방법 알아보고싶다.. : printf("%d %d", jeongSou, sangDeok); 같은거 말하는겅?.?
		System.out.println(sangDeok);
	}
}
