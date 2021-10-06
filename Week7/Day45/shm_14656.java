import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int discordCnt = 0;
		
		for(int i = 1; i <= students; i++) {
			int order = sc.nextInt();
			if(order != i) {
				discordCnt++;
			}
		}
		System.out.println(discordCnt);
	}
}