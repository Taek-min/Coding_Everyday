import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			for(int j = num * 2 - 2 * i; j > 0; j--) {
				System.out.printf(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i = 0; i < num; i++) {
			for(int j = num - i; j > 0; j--) {
				System.out.printf("*");
			}
			for(int j = 0; j < i * 2; j++) {
				System.out.printf(" ");
			}
			for(int j = num - i; j > 0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}////다들 잘 푸셧네요 : 22
