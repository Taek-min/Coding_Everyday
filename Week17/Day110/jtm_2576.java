import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int result = 0;
		int odd[] = new int[7];
		for(int i = 0; i < odd.length; i++) {
			num = sc.nextInt();
			if(num % 2 != 0) {
				odd[i] = num;
				sum += num;
			}
			
		}
		
		if(sum == 0) {
			System.out.println(-1);
			return;
		}
		
		Arrays.sort(odd);
		for(int i = 0; i < odd.length; i++) {
			if(odd[i] % 2 != 0) {
				result = odd[i];
				break;
			}
		}
		System.out.println(sum);
		System.out.println(result);
	}
}
