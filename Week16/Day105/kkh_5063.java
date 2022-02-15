import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i = 0; i < N; i++) {
			int r = in.nextInt();
			int e = in.nextInt();
			int c = in.nextInt();
			
			if(r > e - c) {
				System.out.println("do not advertise");
			} else if(r == e - c) {
				System.out.println("does not matter");
			} else {
				System.out.println("advertise");
			}
		}
	}
}
// 너무 쉽다 그지~
// good