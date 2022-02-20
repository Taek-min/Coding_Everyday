import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int result = 1;
		
		while(N != 1) {
			result = cnt * 6 + result;
			
			if(result >= N) {
				break;
			}
			cnt++;
		}
		System.out.println(++cnt);
	}
}
// 깔꼼