import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		int changYoung = 100;
		int sangDuck = 100;
		for(int i = 0; i < round; i++) {
			int changDice = sc.nextInt();
			int sangDice = sc.nextInt();
			
			if(changDice < sangDice) {
				changYoung -= sangDice;
			}
			else if(sangDice < changDice) {
				sangDuck -= changDice;
			}
		}
		System.out.println(changYoung);
		System.out.println(sangDuck);
	}
}
