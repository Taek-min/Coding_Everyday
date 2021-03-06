import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			int num[] = new int[2];
			int gcd = 0;
			int lcm = 0;
			for(int l = 0; l < num.length; l++) {
				num[l] = sc.nextInt();
			}
			Arrays.sort(num);
			
			for(int j = 1; j <= num[0]; j++) { //// j = num[0] 시작하면 간결해져요  : for(int j = num[0]; 0 < j; j--)이렇게 역순으로 짜면 간결해질거같아용
				if(num[0] % j == 0) {			////  for(int j = num[0]; 0 < j; j--) 이렇게 하면 밑에 조건식을 수정해야 되고 바꾼다고 간결해질건 없어보입니당
					for(int k = 1; k <= num[1]; k++) {
						if(num[1] % k == 0 && j == k) {
							gcd = k;
							break;
						}
					}
				}
			}
			lcm = num[0] * num[1] / gcd; 
			System.out.printf("%d %d\n", lcm, gcd);
		}
	}
}