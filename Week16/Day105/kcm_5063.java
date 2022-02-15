import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		in.nextLine();
		for(int i =0; i < testCase; i++) {
			int r = in.nextInt();
			int e = in.nextInt();
			int c = in.nextInt();
			if(r == e - c) {
				System.out.println("does not matter");
			}
			else if(r > e - c) {
				System.out.println("do not advertise");
			}
			else {
				System.out.println("advertise");
			}
		}
	}
}
// 숩다 수어~ : 22