import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int round = in.nextInt();
		int changScore = 100;
		int sangScore = 100;

		for(int i = 0; i < round; i++) {
			int changDice = in.nextInt();
			int sangDice = in.nextInt();
			if(changDice > sangDice) {
				sangScore -= changDice;
			}
			else if(changDice < sangDice) {
				changScore -= sangDice;
			}
		}
		
		System.out.println(changScore);
		System.out.println(sangScore);
	}
}
