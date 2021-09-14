import java.util.Scanner;

public class Main {
	////깔꼼
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int totalDays = day;
		for (int i = 0; i < month - 1; ++i) {
			totalDays += dayOfMonth[i];
		}
		
		System.out.println(dayOfWeeks[totalDays % 7]);
	}
}