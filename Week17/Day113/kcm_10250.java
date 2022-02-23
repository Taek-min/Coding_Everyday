import java.util.Scanner;

public class kcm_10250 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int h = in.nextInt();
			int w = in.nextInt();
			int n = in.nextInt();
			if( n % h > 0) {
				System.out.println(n % h * 100 + n / h + 1);
			}
			else {
				System.out.println(h * 100 + n / h);
			}
		}
	}
}

//와 씌 너무 깔끔한데? 잘해~~