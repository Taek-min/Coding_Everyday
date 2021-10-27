import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loop = in.nextInt();
		
		for(int i = 0; i < loop; i++) {
			int x = in.nextInt();/// x, y ㅋㅋ :문제에 충실한거지,,,?ㅋㅋㅋ : 진지한편. : 창민이 짱!
			int y = in.nextInt();
			if (x >= y) {
				System.out.println("MMM BRAINS");
			}
			else {
				System.out.println("NO BRAINS");
			}
		}
	}
}
