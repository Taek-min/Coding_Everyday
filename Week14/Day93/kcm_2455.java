import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int passenger = 0;

		for(int i = 0; i < 4; i++) {
			int quit = in.nextInt();
			passenger -= quit;
			int enter = in.nextInt();
			passenger += enter;
			if(passenger > max) {
				max = passenger;
			}
		}

		System.out.println(max);
	}
}
