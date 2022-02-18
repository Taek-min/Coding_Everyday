import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 1;
		int range = 1;	

		while(true) {
			if(range >= num) {
				break;
			}
			range += 6 * count;
			count++;
		}

		System.out.println(count);
	}
}
