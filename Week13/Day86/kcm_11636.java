import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		in.nextLine();

		for(int i = 0; i < testCase; i++) {
			int temp = 0;
			int incomes = 0;
			int turtle[] =  Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j = 0; j < turtle.length; j++) {
				if(turtle[j]  > temp *2 && temp != 0) {
					incomes += turtle[j] - (temp * 2);
				}
				
				temp = turtle[j];
			}

			System.out.println(incomes);
		}
	}
}
