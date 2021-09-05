package Day14;
import java.util.Scanner;
public class kcm_2501 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int num = in.nextInt();
		int location = in.nextInt();
		
		for(int i = 1; i <=num; i++) {
			if(num % i == 0) {
				count++;
				if(count == location) {
					System.out.println(i);
				}
			}
		}
		if(count < location) {
			System.out.println(0);
		}

	}

}
