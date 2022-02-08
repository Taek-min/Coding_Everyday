import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long term = 5;
		long num = 7;
		
		for(int i = 0; i < N-1; i++) {
			term += num;
			num += 3;
		}
		System.out.println(term % 45678);
	}
}

// 깔끔하게 풀었네 : 2