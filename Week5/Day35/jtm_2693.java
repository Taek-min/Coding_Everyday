import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] num = new int[10];
		
		for(int i = 0; i < testCase; i++) {
			for(int j = 0; j < 10; j++) {
				num[j] = sc.nextInt();
			}
			Arrays.sort(num);
			System.out.println(num[7]);
		}
	}
}
