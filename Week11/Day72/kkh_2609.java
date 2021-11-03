import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int flag = 0;
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		for(int j = num1; flag == 0; j--) { //최대공약수
			for(int z = j; z > 0; z--) {
				if(num1 % z == 0 && num2 % z == 0) {
					System.out.println(z + "\n" + (num1 * num2) / z);
					flag = 1;
					break;
				}
			}
		}
	}
}
////잘하네~ : 22 :3