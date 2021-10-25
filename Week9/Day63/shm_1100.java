import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chess[] = new String[8];
		int cnt = 0;
		
		for(int i = 0; i < chess.length; i++) {
			chess[i] = sc.nextLine();
		}
		
		for(int i = 0; i < chess.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < chess.length; j+=2) {
					if(Character.toString(chess[i].charAt(j)).equals("F")) {
						cnt++;
					}
				}
			}
			else {
				for(int j = 1; j < chess.length; j+=2) {
					if(Character.toString(chess[i].charAt(j)).equals("F")) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
} //대다내~!!!
