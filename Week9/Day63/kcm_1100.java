import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char chess[][] = new char[8][8];
		int count = 0;

		for(int i = 0; i < chess.length; i++) {
			String str = in.nextLine();
			chess[i] = str.toCharArray();
		}
		
		for(int j = 0; j < chess.length; j++) {
			for(int k = 0; k <chess[j].length; k++) {
				if(j % 2 == 0 && k % 2 ==0) {
					if(chess[j][k] == 'F') {
						count++;
					}
				}
				else if(j % 2 == 1 && k % 2 == 1) {
					if(chess[j][k] == 'F') {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
