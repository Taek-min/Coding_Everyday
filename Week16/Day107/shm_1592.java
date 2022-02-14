import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int cnt = 0;
		int index = 1;
		int friends[] = new int[N + 1];
		
		friends[1] = 1;
		
		while(true) {
			if(friends[index] == M) {
				break;
			}
			
			if(friends[index] % 2 == 1) {
				index += L;
				if(index > N) {
					index %= N;
				}
			}
			else {
				index -= L;
				if(index < 1) {
					index += N;
				}
			}
			friends[index]++;
			cnt++;
		}
		System.out.println(cnt);
	}
}
