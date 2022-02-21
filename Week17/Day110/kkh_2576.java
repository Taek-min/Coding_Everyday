import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int min = 100;
		int sum = 0;
		
		for(int i = 0; i < 7; i++) {
			int n = in.nextInt();
			if(n % 2 == 1) {
				sum += n;
				if(min > n) {
					min = n;
				}
			}
		}
		
		if(sum == 0) {
			System.out.print("-1");
		} else {
			System.out.print(sum + "\n" + min);			
		}
	}
}
// 잘 하 시 네 ? 