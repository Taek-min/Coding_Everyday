import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double wook = in.nextInt();
		double jee = in.nextInt();
		double Wookjee = (jee - wook) / 400;
		double win =  1 / (1 + Math.pow(10, Wookjee));
		System.out.println(win);
	}
}
//깔꼼하네 : 2