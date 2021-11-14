import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //// 잘해잘해
		Scanner in = new Scanner(System.in);
		String result = "";
		for(int i = 0; i < 5; i++) {
			if(in.nextLine().contains("FBI")) {
				result += (i + 1) + " ";
			}
		}
		
		if(result.equals("")) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(result);
		}
	}
}