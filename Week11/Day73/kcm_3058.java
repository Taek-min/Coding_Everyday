import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < testCase; i++) {
			int min = 100;
			int sum = 0;
			for(int j = 0; j < 7; j++) {
				int num = in.nextInt();
				if(num % 2 == 0) {
					sum += num;
					if(min > num) {
						min = num;
					}
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}
