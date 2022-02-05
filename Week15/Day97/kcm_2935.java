import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger A = in.nextBigInteger();
		String operator = in.next();
		BigInteger B = in.nextBigInteger();
		
		if(operator.equals("*")) {
			System.out.println(A.multiply(B));
		}
		else {
			System.out.println(A.add(B));
		}
	}
}
// Good man  :2