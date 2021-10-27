import java.util.Scanner;

public class Main {// 저와 생각이 같군요  :2 이번 문제 다 똑같이 풀엇네 : 아구잘해~ :이고 잘해~
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
		System.out.println(changYoung); //이거 한번에 쓰는 방법 알아보고싶다..
		System.out.println(sangDuck);
	}
}
