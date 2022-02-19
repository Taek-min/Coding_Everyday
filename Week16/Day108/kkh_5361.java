import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cnt = in.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			double price = 0.0;
			price += (double) (in.nextInt() * 350.34);
			price += (double) (in.nextInt() * 230.90);
			price += (double) (in.nextInt() * 190.55);
			price += (double) (in.nextInt() * 125.30);
			price += (double) (in.nextInt() * 180.90);
			
			System.out.printf("$%.2f\n", price);
		}
	}
}