import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int diff1 = w > x * 2 ? x : w - x;
		int diff2 = h > y * 2 ? y : h - y;
		
		System.out.println(diff1 < diff2 ? diff1 : diff2);
	}
}
//멋있어요 잘풀었네요 :2