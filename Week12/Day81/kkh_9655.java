import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //// 따라하지마
		Scanner in = new Scanner(System.in);
		
		if(in.nextInt() % 2 == 1) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
	}
}