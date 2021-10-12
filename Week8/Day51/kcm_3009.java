import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x[] = new int[3];
		int y[] = new int[3];
		for(int i= 0 ; i < 3; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		if(x[0] == x[1]) {
			System.out.print(x[2] + " ");
		}
		else {
			System.out.print(x[0] + " ");
		}
		if(y[0] == y[1]) {
			System.out.print(y[2]);
		}
		else {
			System.out.print(y[0]);
		}
	}
}