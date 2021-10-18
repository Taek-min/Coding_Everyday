import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] students = new int[31];

		for(int i = 0; i < 28; i++) {
			int attendance = sc.nextInt();
			students[attendance] = attendance;
		}
		for(int j = 1; j <= 30; j++) {
			if(students[j] == 0) {
				System.out.println(j);
			}
		}
	}
}
