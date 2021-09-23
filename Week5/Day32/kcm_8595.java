
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Length = in.nextInt();
		in.nextLine();
		String code = in.nextLine();
		long hiddenNum = 0;
		String num = "";
		for(int i = 0; i < Length; i++) {
			if('0' <= code.charAt(i) && code.charAt(i) <= '9') {
				num += code.charAt(i);
				if(i == Length-1) {
					for(int j = 0; j < num.length(); j++) {
						hiddenNum += (num.charAt(j) - '0') * Math.pow(10, num.length()-(1 + j));
					}
				}
			}
			else {
				for(int j = 0; j < num.length(); j++) {
					hiddenNum += (num.charAt(j) - '0') * Math.pow(10, num.length()-(1 + j));
				}
				num = "";
			}
		}
		System.out.println(hiddenNum);
	}
}
