import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger first = new BigInteger(sc.nextLine());
		String operator = sc.nextLine();
		BigInteger second = new BigInteger(sc.nextLine());
		
		if(operator.equals("+")) {
			System.out.println(first.add(second));
		}
		else if(operator.equals("*")) {
			System.out.println(first.multiply(second));
		}
	}
}
// 다들 똒같구만 
// 똑. 같구만이야. : 2