import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean seat[] = new boolean[101];
		int visits = in.nextInt();
		int count = 0;
		for(int i = 0; i < visits; i++) {
			int human = in.nextInt();
			if(seat[human]) {
				count++;
			}
			else {
				seat[human] = true;
			}
		}
		System.out.println(count);
	}
}
