import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		if(x > Math.abs(w - x) ) {
			x = Math.abs(w - x);
		}
		if( y > Math.abs(h - y)) {
			y = Math.abs(h - y);
		}
		if(x > y) {
			System.out.println(y);
		}
		else {
			System.out.println(x);
		}
	}
}
//최고에요