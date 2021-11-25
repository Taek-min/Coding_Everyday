import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int passenger = 0;

		for(int i = 0; i < 4; i++) {
			int quit = in.nextInt(); //이거 바로 계산해도 되지롱 >_<
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
