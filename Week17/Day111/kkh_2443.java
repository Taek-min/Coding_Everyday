import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i < j) {
					System.out.print("*");				
				} else {
					System.out.print(" ");
				}
			}
			for(int j = n - 1; j > 0; j--) {
				if(i < j) {
					System.out.print("*");				
				}
			}
			System.out.println();
		}
	}
}
// for문 살짞 아쉽네용 : 2 문제에 답이 있던데... 