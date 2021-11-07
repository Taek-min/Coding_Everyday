import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		
		for(int i = 0; i < 9; i++) {
			price -= in.nextInt();
		}
		
		System.out.println(price);
	}
}