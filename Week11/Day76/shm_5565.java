import java.util.Scanner;

public class Main { //// 굳
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int price = 0;
		
		for(int i = 0; i < 9; i++) {
			price += sc.nextInt();
		}
		System.out.println(total - price);
	}
}