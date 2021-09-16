package Day25;

import java.util.Scanner;

public class kcm_5988 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		for(int i = 0; i<testCase; i++) {
			String number[] = in.next().split("");
			if(Integer.parseInt(number[number.length-1]) % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}

}
