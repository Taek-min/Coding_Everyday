import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] num1 = in.next().split("");
		String[] num2 = in.next().split("");

		long result = 0;
		for(int i = 0; i < num1.length; i++) {
			for(int j = 0; j < num2.length; j++) {
				result += Integer.parseInt(num1[i]) * Integer.parseInt(num2[j]);
			}
		}
		
		System.out.println(result);
	}
}