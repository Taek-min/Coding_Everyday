import java.util.*;

public class Main {
	public static void main(String[] args) { //나랑 또까터네~? :2 잘풀어~ : 3
		Scanner sc = new Scanner(System.in);
		long[] num = new long[2];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextLong();
		}
		Arrays.sort(num);
		
		if(num[0] == num[1]) {
			System.out.println(0);
		}
		else {
			System.out.println(num[1] - num[0] - 1);
		}
		
		for(long i = num[0] + 1; i < num[1]; i++) {
			System.out.printf("%d ", i);
		}
	}
}