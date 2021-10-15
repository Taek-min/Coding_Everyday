import java.util.Scanner;

public class Main { // 저와 생각이 같아버렸군요 : 아구잘해~~ :이고잘해~~
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
			}//이거 혹시 안붙이나? 띄어쓰나? 
			else if(changDice < sangDice) {
				changScore -= sangDice;
			}
		}
		
		System.out.println(changScore); //이거 한번에 쓰는 방법 알아보고싶다..
		System.out.println(sangScore);
	}
}
