import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[2];
		int gcd = 0;
		int lcm = 0;
		
		for(int l = 0; l < num.length; l++) {
			num[l] = sc.nextInt();
		}
		Arrays.sort(num);
		
		for(int j = 1; j <= num[0]; j++) { //// 71일차 문제 처럼 역순으로 하면 간결해질거 같아요
			if(num[0] % j == 0) {
				for(int k = 1; k <= num[1]; k++) {
					if(num[1] % k == 0 && j == k) {
						gcd = k;
						break;
					}
				}
			}
		}
		lcm = num[0] * num[1] / gcd; 
		System.out.println(gcd);
		System.out.println(lcm);
	}
}