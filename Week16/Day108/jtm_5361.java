import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double result = 0;
		
		for(int i = 0; i < testcase; i++) {
			double A = sc.nextInt() * 350.34;
			double B = sc.nextInt() * 230.90;
			double C = sc.nextInt() * 190.55;
			double D = sc.nextInt() * 125.30;
			double E = sc.nextInt() * 180.90;
			result = A + B + C + D + E;
			System.out.printf("$" + "%.2f\n", result);
		}
	}
}