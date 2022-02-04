import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger num1 = in.nextBigInteger();
		String op = in.next();
		BigInteger num2 = in.nextBigInteger();
		
		if(op.equals("+")) {
			System.out.println(num1.add(num2));
		} else {
			System.out.println(num1.multiply(num2));
		}
	}
}
