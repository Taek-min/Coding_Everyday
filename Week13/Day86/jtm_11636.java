import java.util.Arrays;
import java.util.Scanner;

public class Main { //// 따라하지마
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < testCase; i++) {
			int tmp = 0;
			int incomes = 0;
			int turtle[] =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			for(int j = 0; j < turtle.length; j++) {
				if(turtle[j]  > tmp * 2 && tmp != 0) { //깔꼼하네
					incomes += turtle[j] - (tmp * 2);
				}
				tmp = turtle[j];
			}
			System.out.println(incomes);
		}
	}
}
