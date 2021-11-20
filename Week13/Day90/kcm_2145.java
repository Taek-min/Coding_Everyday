import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			String str = in.nextLine();
			if(str.equals("0")) {
				break;
			}
			int temp = 0;
			while(temp == 0 || temp > 10) {
				for(int i = 0; i < str.length(); i++) {
					temp += str.charAt(i) - '0';
				}
				if(temp > 10) {
					str = Integer.toString(temp);
					temp = 0;
				}
			}
			System.out.println(temp);
		}
	}
}
