import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		in.nextLine();

		for(int i = 0; i < testCase; i++) {
			int tmp = 0;
			int incomes = 0;
			int turtle[] =  Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			for(int j = 0; j < turtle.length; j++) {
				if(turtle[j]  > tmp * 2 && tmp != 0) {
					incomes += turtle[j] - (tmp * 2);
				}
				tmp = turtle[j];
			}
			System.out.println(incomes);
		}
	}
}
