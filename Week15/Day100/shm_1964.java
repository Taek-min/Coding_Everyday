import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long total = 5;
		
		for(int i = 1; i <= num; i++) {
			if(i > 1) {
				total += (i + 1) + i * 2; 
			}
		}
		System.out.println(total % 45678);
	}
}
// 잘했네~