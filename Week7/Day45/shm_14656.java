import java.util.Scanner;

//// 아주 깔끔
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int discordCnt = 0; //// 예?
		
		for(int i = 1; i <= students; i++) {
			int order = sc.nextInt();
			if(order != i) {
				discordCnt++;
			}
		}
		System.out.println(discordCnt);
	}
}