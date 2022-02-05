import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		double M = (double)(B - A) / 400;
		System.out.printf("%.6f", 1 / (1+Math.pow(10, M)));
	}
}
//깔꼼하네 :2 : 3