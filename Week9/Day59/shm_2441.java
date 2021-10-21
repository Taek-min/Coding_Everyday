import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for(int k = loop - i; k > 0; k--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}////굿굿굿 :2