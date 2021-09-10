package Day19;

import java.util.Scanner;

public class kcm_2712 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for(int i = 0 ; i < test; i++) {
			double number = in.nextDouble();
			String unit = in.next();
			if(unit.equals("kg")) {
				number = number * 2.2046;
				System.out.println(String.format("%.4f ",number) + "lb");
			}
			else if(unit.equals("g")) {
				number = number * 3.7854;
				System.out.println(String.format("%.4f ",number) + "l");
			}
			else if(unit.equals("lb")) {
				number = number * 0.4536;
				System.out.println(String.format("%.4f ",number) + "kg");
			}
			else {
				number = number * 0.2642;
				System.out.println(String.format("%.4f ",number) + "g");
			}
		}
	}

}
