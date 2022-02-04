import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		double M = (B-A) / 400;

		System.out.println(1 / (1 + Math.pow(10, M)));
	}
}
