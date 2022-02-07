import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		long dot = 5;
		
		if(num == 1) {
			System.out.println(dot);
		}
		else {
			for(int i = 2; i <= num; i++) {
				dot += 4 + 3 * (i - 1);
			}
			System.out.println(dot % 45678);
		}
	}
}