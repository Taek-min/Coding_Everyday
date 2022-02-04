import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		System.out.println(1 / (1 + Math.pow(10, (second - first) / 400)));
	}
}
//깔꼼하네 : 2