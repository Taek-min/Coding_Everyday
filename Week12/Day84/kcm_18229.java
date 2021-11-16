import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { // 이야ㅏ~ for문 두개로 푸네? 잘하네~
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		in.nextLine();
		
		int length = m;
		int num = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < m; j++) {
				sum += in.nextInt();
				if(sum >= k) {
					if(length > j) {
						length =  j;
						num = i;
					}
				}
			}
		}
		
		System.out.println((num + 1) + " " + (length +1));
	}
}
