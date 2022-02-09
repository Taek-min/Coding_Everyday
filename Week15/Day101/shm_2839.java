import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int total = 0;
		
		while(true) {
			if(K < 0) {
				total = -1;
				break;
			}
			
			if(K % 5 == 0) {
				total += K / 5;
				break;
			}
			else {
				K -= 3;
				total++;
			}
		}
		System.out.println(total);
	}
}
// 잘풀었네~ :2 : 3