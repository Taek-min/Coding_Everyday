import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int check = 0;
		
		for(int i = 0; i < 19; i++) {
			if(Math.pow(2, i) <= num && num < Math.pow(2, i + 1)) {
				check = i;
			}
		}
		
		if(Math.pow(2, check) == num) {
			System.out.println((int)Math.pow(2, check));
		}
		else {
			System.out.println((int)(2 * (num - Math.pow(2, check))));
		}
	}
}

// 제곱근 힌트 알려준 현민이 멋져/
