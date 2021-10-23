import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int num[] = new int[loop];
		
		for(int i = 0; i < loop; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		for(int i = 1; i <= num[0]; i++) {
			int cnt = 0;
			for(int j = 0; j < loop; j++) {
				if(num[j] % i == 0) {
					cnt++;
				}
			}
			if(cnt == loop) {
				System.out.println(i);
			}
		}
	}
}
//// 굳굳