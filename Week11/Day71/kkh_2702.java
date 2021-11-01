import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int GCD = 1;
		int flag = 0;
		
		for(int i = 0; i < T; i++) {
			flag = 0;
			int num1 = in.nextInt();
			int num2 = in.nextInt();

			for(int j = num1; flag == 0; j--) {
				for(int z = j; z > 0; z--) {
					if(num1 % z == 0 && num2 % z == 0) {
						GCD = z;
						flag = 1;
						break;
					}
				}
			}
			
			System.out.println((num1 * num2) / GCD + " " + GCD);
		}
	}
}