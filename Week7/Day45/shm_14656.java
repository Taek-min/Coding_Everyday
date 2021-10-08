import java.util.Scanner;

//// 아주 깔끔 :2:3
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int discordCnt = 0; //// 예? 디스코드 : 디스코드가 그렇게 하고싶었으면 말을하지.... 불일치라는 뜻도 있던데,,,,
		
		for(int i = 1; i <= students; i++) {
			int order = sc.nextInt();
			if(order != i) {
				discordCnt++;
			}
		}
		System.out.println(discordCnt);
	}
}